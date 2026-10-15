package org.example;

public class Student {

    String name;
    String studentNumber;
    double mark;
    boolean hasPassed;

    Student(String name, String studentNumber, double mark){
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;

    }
    void displayDetails(){
        System.out.println("Name:" + this.name + " " + "Student Number:" + this.studentNumber + " " + "Mark:"+ this.mark);
    }
    void hasPassed(){
        if (mark >= 50){
            System.out.println("true");

        }
        else {
            System.out.println("false");
            }
        }
    }

