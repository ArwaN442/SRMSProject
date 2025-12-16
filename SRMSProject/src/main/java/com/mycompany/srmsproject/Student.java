/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srmsproject;

public class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;
    private int year;

    public Student(String name, int age, String studentId, 
                   String major, double gpa, int year) {
        super(name, age); 
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
        this.year = year;  }

    public String getStudentId() {
        return studentId; }
    public void setStudentId(String studentId) {
        this.studentId = studentId; }

    public String getMajor() {
        return major;  }
    public void setMajor(String major) {
        this.major = major; }

    public double getGpa() {
        return gpa; }
    public void setGpa(double gpa) {
        this.gpa = gpa; }

    public int getYear() {
        return year; }
    public void setYear(int year) {
        this.year = year;  }
    
    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", Major: " + major +
                ", GPA: " + gpa +
                ", Year: " + year;  }
}
