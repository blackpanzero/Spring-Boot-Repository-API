package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable String id){
        return studentService.getStudent(id);
    }
    @PutMapping("/students/{id}")
    public void editStudent(@RequestBody Student student, @PathVariable String id){
        studentService.editStudent(student,id);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }


}
