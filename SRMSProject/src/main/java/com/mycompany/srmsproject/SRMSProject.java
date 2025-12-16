/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.srmsproject;
import java.util.Locale;
import java.util.Scanner;
// test push
public class SRMSProject {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager("students.txt");
        try{
           manager.loadData();
        } catch (Exception e) {
            System.out.println("No existing data found.");
        }
        
        AutoSaveThread autoSave = new AutoSaveThread(manager);
        autoSave.start();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Major: ");
                        String major = sc.nextLine();
                        System.out.print("GPA: ");
                        double gpa = sc.nextDouble();
                        System.out.print("Year: ");
                        int year = sc.nextInt();

                       manager.addStudent(new Student(name, age, id, major, gpa, year));
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        for (Student s : manager.getAllStudents()) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to Delete: ");
                        manager.deleteStudent(sc.nextLine());
                        System.out.println("Student Deleted successfully.");
                        break;

                    case 4:
                        manager.saveData();
                        System.out.println("Data saved. Exiting... ");
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}