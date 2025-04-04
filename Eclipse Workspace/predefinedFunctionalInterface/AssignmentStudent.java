package com.predefinedFunctionalInterface;

import java.util.*;

class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + '}';
    }
   
    	public static void main(String[] args) {
    
        
        Student std1 = new Student("Sanchitha M O", 23, 67.7);
        Student std2 = new Student("Sudeep Kumar M O", 26, 45.34);
        Student std3 = new Student("Varsha", 25, 78.7);
        Student std4 = new Student("Varsha M N", 25, 30.5);
        Student std6 = new Student("Swathi M N", 25, 45.5);
        Student std5 = new Student("Varun M 0", 25, 99.99);
        Student std7 = new Student("Parimala M 0", 25, 89.6);
        

        
        List<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std6);
        students.add(std5);
        students.add(std7);

        
        System.out.println("Students with grade greater than 60:");
        for (Student student : students) {
            if (student.getGrade() > 60) {
                System.out.println(student);
            }
        }
    }
}

