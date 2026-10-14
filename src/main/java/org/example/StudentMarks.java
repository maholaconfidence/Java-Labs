package org.example;

public class StudentMarks {
    void Marks(){
        int[] marks ={60,70,78,78,80};

        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++){
            System.out.println("Marks" + (i +1) + ":" + marks[i]);
            totalMarks += marks[i];
        }
        double avgMark = (double)totalMarks/ marks.length;

        System.out.println("Total Mark:" + totalMarks);
        System.out.println("Average Mark:" + avgMark);
    }
}
