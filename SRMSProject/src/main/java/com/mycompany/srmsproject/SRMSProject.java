/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.srmsproject;


 class Person {
      private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter للـ name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter للـ age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString لطباعة البيانات بشكل واضح
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

 class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;
    private int year;

    // Constructor
    public Student(String name, int age, String studentId, String major, double gpa, int year) {
        super(name, age); 
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
        this.year = year;
    }

    // Getter & Setter 
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", Major: " + major +
                ", GPA: " + gpa +
                ", Year: " + year;
    }
}
public class SRMSProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
