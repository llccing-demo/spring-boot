package com.xinda.springboot.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseContorller {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()  {
        return Arrays.asList(
                new Course(1, "learn AWS", "go"),
                new Course(2, "learn DevOps", "go"),
                new Course(3, "learn BIRT", "go")
        );
    }
}
