package dev.ismailtezal.devTest.model.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    private ObjectId id;
    private String courseName;
    private String courseDuration;
    private String instructor;
    private List<Lesson> lessons;
}