package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.IStudent;
import com.example.dataBase_Relationship.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudent iStudent;
    public void addStudent(Student student) {
        iStudent.save(student);
    }

    public Student getStudentById(Integer studentId) {
        return iStudent.findById(studentId).get();
    }

    public List<Student> getAllStudent() {
        return iStudent.findAll();
    }

    public Student updateStudent(Integer studentId, Student student) {
        Student student1=iStudent.findById(studentId).get();
        student1.setStudentAge(student.getStudentAge());
        student1.setStudentBranch(student.getStudentBranch());
        student1.setStudentName(student.getStudentName());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setAddress(student.getAddress());
        student1.setStudentDepartment(student.getStudentDepartment());
        return iStudent.save(student1);
    }

    public void deleteStudent(Integer studentId) {
        iStudent.deleteById(studentId);
    }
}
