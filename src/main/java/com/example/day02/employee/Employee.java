package com.example.day02.employee;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private  String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }


}
