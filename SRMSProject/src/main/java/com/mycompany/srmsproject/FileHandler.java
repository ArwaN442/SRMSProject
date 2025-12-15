/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srmsproject;
import java.io.*; 
import java.util.ArrayList;

public class FileHandler {
    private final String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Student> readStudents() throws CustomException {
        ArrayList<Student> students = new ArrayList<Student>();
        File file = new File(filePath);

        if (!file.exists()) {
            return students;
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 6) {
                    throw new CustomException("Invalid data format");
                }
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String studentId = data[2];
                String major = data[3];
                double gpa = Double.parseDouble(data[4]);
                int year = Integer.parseInt(data[5]);
                Student s = new Student(name, age, studentId, major, gpa, year);
                students.add(s);
            }

        } catch (IOException e) {
            throw new CustomException("File read error: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new CustomException("Invalid number format in file");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
            }
        }
        return students;
    }
    public void writeStudents(ArrayList<Student> students) throws CustomException {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(filePath));
            for (Student s : students) {
                pw.println(
                        s.getName() + "," +
                        s.getAge() + "," +
                        s.getStudentId() + "," +
                        s.getMajor() + "," +
                        s.getGpa() + "," +
                        s.getYear()
                );
            }
        } catch (IOException e) {
            throw new CustomException("File write error: " + e.getMessage());
        } finally {
            if (pw != null) pw.close();
        }
    }
}
