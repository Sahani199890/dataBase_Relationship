package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.ICourse;
import com.example.dataBase_Relationship.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourse iCourse;
    public void addCourse(Course course) {
        iCourse.save(course);
    }

    public Course getCourseById(Integer courseId) {
        return iCourse.findById(courseId).get();
    }

    public List<Course> getAllCourses() {
        return iCourse.findAll();
    }

    public Course updateCourse(Integer courseId, Course course) {
        Course course1=iCourse.findById(courseId).get();
        course1.setDuration(course.getDuration());
        course1.setTitle(course.getTitle());
        course1.setStudentList(course.getStudentList());
        course1.setDescription(course.getDescription());
        return iCourse.save(course1);
    }

    public void deleteCourse(Integer courseId) {
        iCourse.deleteById(courseId);
    }
}
