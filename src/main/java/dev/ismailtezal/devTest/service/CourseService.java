package dev.ismailtezal.devTest.service;

import dev.ismailtezal.devTest.model.courses.Course;
import dev.ismailtezal.devTest.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> allCourses(){
        List<Course> courses = courseRepository.findAll();

        return courses;
    }
}
