/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srmsproject;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;
    private FileHandler fileHandler;


    public StudentManager(String filePath) {
        students = new ArrayList<>();
        fileHandler = new FileHandler(filePath);
    }
 
    public synchronized void addStudent(Student student) {
        students.add(student);
    }

    public synchronized void updateStudent(String id, Student updatedStudent) throws CustomException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(id)) {
                students.set(i, updatedStudent);
                return;
            }
        }
        throw new CustomException("Student not found");
    }

    public synchronized void deleteStudent(String id) throws CustomException {
        boolean removed = students.removeIf(s -> s.getStudentId().equals(id));
        if (!removed) {
            throw new CustomException("Student not found");
        }
    }

    public synchronized Student getStudentById(String id) throws CustomException {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }
        throw new CustomException("Student not found");
    }

    public synchronized ArrayList<Student> getAllStudents() {
        return students;
    }

    public synchronized void loadData() throws CustomException {
        students = fileHandler.readStudents();
    }

    public synchronized void saveData() throws CustomException {
        fileHandler.writeStudents(students);
    }
}