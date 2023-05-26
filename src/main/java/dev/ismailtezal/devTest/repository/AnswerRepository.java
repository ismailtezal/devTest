package dev.ismailtezal.devTest.repository;

import dev.ismailtezal.devTest.model.courses.Answer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<Answer, ObjectId> {

}
