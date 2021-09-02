package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
    ArrayList<Student> al=new ArrayList<Student>(
            Arrays.asList(
                    new Student(45,"Addy",56),
                    new Student(66,"namam",45)
            )
    );
    public List<Student> getStudents(){
        return al;
    }
    public Student get1student(int rollno){
//        return al.stream().filter(t ->t.getrollno().equals(rollno).findFirst().get());
        return al.stream().filter(a ->a.getRollno().equals(rollno).findFirst().get());
    }

}
