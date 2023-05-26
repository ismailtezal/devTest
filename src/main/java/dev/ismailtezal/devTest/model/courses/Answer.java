package dev.ismailtezal.devTest.model.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test-ml")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    private ObjectId id;

    private int repeatLesson;
    private int correctAnswer;
    private int wrongAnswer;
    private int emptyAnswer;

}
