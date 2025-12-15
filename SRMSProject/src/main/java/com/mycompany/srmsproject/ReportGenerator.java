/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srmsproject;
import java.util.ArrayList; 

public class ReportGenerator {
    private final StudentManager manager;

    public ReportGenerator(StudentManager manager) {
        this.manager = manager;
    }

    public void reportByGPA() {
        ArrayList<Student> students = manager.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getStudentId() + " | " + s.getName() + " | GPA: " + s.getGpa());
        }
    }

    public void reportByMajor() {
        ArrayList<Student> students = manager.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getStudentId() + " | " + s.getName() + " | Major: " + s.getMajor());
        }
    }

    public void reportByYear() {
        ArrayList<Student> students = manager.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getStudentId() + " | " + s.getName() + " | Year: " + s.getYear());
        }
    }
}
