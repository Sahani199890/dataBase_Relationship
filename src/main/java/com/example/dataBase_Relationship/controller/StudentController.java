package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Student;
import com.example.dataBase_Relationship.service.BookService;
import com.example.dataBase_Relationship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;
        @PostMapping("/student")
        public void addStudent(@RequestBody Student student){
            studentService.addStudent(student);
        }
        @GetMapping("student/{studentId}")
        public Student getStudentById(@PathVariable Integer studentId){
            return studentService.getStudentById(studentId);
        }
        @GetMapping("/student")
        public List<Student> getAllStudent(){
            return studentService.getAllStudent();
        }
        @PutMapping("/student/{studentId}")
        public Student updateStudent(@PathVariable Integer studentId,@RequestBody Student student){
            return studentService.updateStudent(studentId,student);
        }
        @DeleteMapping("/student/{studentId}")
        public void deleteStudent(@PathVariable Integer studentId){
            studentService.deleteStudent(studentId);
        }
}
