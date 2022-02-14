package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students=new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    public Optional<Student> getStudent(String id){
       return studentRepository.findById(id);

    }

    public void editStudent(Student student, String id) {
     studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteAllById(Collections.singleton(id));
    }
}
