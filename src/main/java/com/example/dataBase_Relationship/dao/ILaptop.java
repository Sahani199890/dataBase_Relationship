package com.example.dataBase_Relationship.dao;

import com.example.dataBase_Relationship.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptop extends JpaRepository<Laptop,Integer> {
}
