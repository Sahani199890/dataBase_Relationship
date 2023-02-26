package com.example.dataBase_Relationship.dao;

import com.example.dataBase_Relationship.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent extends JpaRepository<Student,Integer> {
}
