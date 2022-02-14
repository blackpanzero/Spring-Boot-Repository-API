package com.example.demo.student;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private  String id;
    private String name;
    private String depertment;

    public Student() {
    }

    public Student(String id, String name, String depertment) {
        this.id = id;
        this.name = name;
        this.depertment = depertment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
