/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.srmsproject;

public class AutoSaveThread extends Thread {
    private StudentManager manager;

    public AutoSaveThread(StudentManager manager) {
        this.manager = manager;
    }

    @Override
    public void run() { 
        while (true) {
            try {
                Thread.sleep(10000); 
               manager.saveData();
                System.out.println("Auto-saved data...");
            } catch (InterruptedException e) {
                break;
            } catch (Exception e) {
              break;
            }
        }
    }
}