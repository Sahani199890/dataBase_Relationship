package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.ILaptop;
import com.example.dataBase_Relationship.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private ILaptop iLaptop;
    public void addLaptop(Laptop laptop) {
        iLaptop.save(laptop);
    }

    public Laptop getLaptopById(Integer laptopId) {
        return iLaptop.findById(laptopId).get();
    }

    public List<Laptop> getAllLaptops() {
        return iLaptop.findAll();
    }

    public Laptop updateLaptop(Integer laptopId, Laptop laptop) {
        Laptop laptop1=iLaptop.findById(laptopId).get();
        laptop1.setBrand(laptop.getBrand());
        laptop1.setName(laptop.getName());
        laptop1.setPrice(laptop.getPrice());
        return iLaptop.save(laptop1);
    }

    public void deleteLaptop(Integer laptopId) {
        iLaptop.deleteById(laptopId);
    }
}
