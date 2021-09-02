package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
    @GetMapping("/student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/student/{rollno}")
    public Student get1student(@PathVariable int rollno){
        return StudentService.get1student(rollno);
    }
}
