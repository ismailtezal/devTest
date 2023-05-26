package dev.ismailtezal.devTest.repository;

import dev.ismailtezal.devTest.model.courses.Course;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course, ObjectId> {

}
