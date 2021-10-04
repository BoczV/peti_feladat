package com.company.forth;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String neptunCode;
    private int age;

    public Student(String name, String neptunCode, int age) {
        this.name = name;
        this.neptunCode = neptunCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hallgató: " +
                "név = " + name +
                ", neptun kód = " + neptunCode +
                ", életkor = " + age +
                '.';
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();
        Student student1 = new Student("Peti", "ZALTR12", 23);
        Student student2 = new Student("Kinga", "ABCDF24", 24);
        Student student3 = new Student("Viktor", "UZTRA76", 26);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        for (Student student: studentList) {
            if(student.neptunCode.contains("Z")){
                System.out.println(student);
            }
        }

    }
}
