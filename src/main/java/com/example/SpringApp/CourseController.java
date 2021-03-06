package com.example.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/Courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
}
