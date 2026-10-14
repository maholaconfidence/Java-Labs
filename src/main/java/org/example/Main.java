package org.example;
public class Main {
    static void main() {
//        String name = "Confidence";
//        int age = 24;
//        double averageMark = 80.9;
//        boolean isRegistered = true;
//        System.out.println("Student name:"+ name);
//        System.out.println("Age:"+ age);
//        System.out.println("Average Mark:"+ averageMark);
//        System.out.println("Registered:"+ isRegistered);


        //PassOrFail results = new PassOrFail();
        //results.learnerResults();

        NumberAnalysis results = new NumberAnalysis();
        results.Number();

        FullStack fullStack = new FullStack("Karabo",54,"female");
        fullStack.displayDetails();


        }
    }

