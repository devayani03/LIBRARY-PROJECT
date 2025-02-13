package com.devayani.fullstackbackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
    @Id //makes id primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private  String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
