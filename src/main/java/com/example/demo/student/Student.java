package com.example.demo.student;

public class Student {
private int rollno;
private String name;
private int age;

public Student(){

}

//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollno=" + rollno +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getrollno() {
        return null;
    }

//    Student s1=new Student(45,"vaibhav",56);
//    Student s2=new Student(43,"vai",57);

}