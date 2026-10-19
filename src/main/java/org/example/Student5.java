package org.example;

public class Student5 {
    String studentNum;
    String studentName;
<<<<<<< HEAD
    int[] marks;

    Student5(int[] marks){
        this.marks = marks;
    }
    void calcAverage(){
        int totalMarks = 0;
=======
    double[] marks = new double[3];
    double average;

    Student5(String studentNum, String studentName, double[] marks) {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.marks = marks;
        for (int i = 0; i < 3; i++) {
            if (marks[i] <= 0) {
                System.out.println("Mark should be greater than zero");

            } else if (marks[i] > 100) {
                System.out.println("Marks should not be greater than 100");
            }


        }


    }

    void calcAvg() {
        average = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Student average:" + average);
    }

    void hasPassed( ) {
        if (average >= 50) {
            System.out.println("student: " + studentName + "(" + studentNum + ") " + "average: " + average + "You have passes");
        } else {
            System.out.println("student: " + studentName + "(" + studentNum + ") " + "average: " + average + "You have failed");
        }

    }
    void displaySummary(){
        System.out.println("Student:" + studentName + "Student number:" + studentNum + average);
    }


>>>>>>> 9b94d6ae3ce99a51f51324bbcb428fc84218b207

    }


<<<<<<< HEAD
}
=======





>>>>>>> 9b94d6ae3ce99a51f51324bbcb428fc84218b207

