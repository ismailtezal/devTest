import numpy as np
import pymongo
from keras.models import load_model


client = pymongo.MongoClient('mongodb+srv://ismailtezal:ismailTezal3345@cluster0.5k6q5at.mongodb.net')
db = client['devtest-db']
collection = db['test-ml']

data = collection.find_one({}, sort=[('_id', pymongo.DESCENDING)])

print(data)
correct_answer = data["correctAnswer"]
empty = data["emptyAnswer"]
incorrect_answer = data["wrongAnswer"]

model = load_model('model.h5')

X_test = [[correct_answer, empty, incorrect_answer]]

y_pred = np.argmax(model.predict(X_test), axis=-1)
y_pred_list = y_pred.tolist()

collection.update_one({'_id': data['_id']}, {"$set": {"repeatLesson": y_pred_list[0]}})
