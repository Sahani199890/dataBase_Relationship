package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Course;
import com.example.dataBase_Relationship.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
    @GetMapping("course/{courseId}")
    public Course getCoursesById(@PathVariable Integer courseId){
        return courseService.getCourseById(courseId);
    }
    @GetMapping("/course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @PutMapping("/course/{courseId}")
    public Course updateCourse(@PathVariable Integer courseId,@RequestBody Course course){
        return courseService.updateCourse(courseId,course);
    }
    @DeleteMapping("/course/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
    }
}
