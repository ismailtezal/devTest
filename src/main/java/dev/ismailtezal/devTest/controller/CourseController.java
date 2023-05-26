package dev.ismailtezal.devTest.controller;


import dev.ismailtezal.devTest.model.courses.Course;
import dev.ismailtezal.devTest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/courses")
@CrossOrigin("devtest-6ef68.web.app/")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping()
    public ResponseEntity<List<Course>> getCourses(){
        return new ResponseEntity<List<Course>>(courseService.allCourses(), HttpStatus.OK);
    }

}
