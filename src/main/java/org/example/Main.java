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

        //NumberAnalysis results = new NumberAnalysis();
        //results.Number();

        FullStack fullStack = new FullStack("Karabo",54,"female");
       // fullStack.displayDetails();

        Car car = new Car("red","Toyota","Canry",2020);
        Car car2 = new Car("black","Honda","Civic",2022);
        Car car3 = new Car("white","Ford","Mustang",2023);

//Car[] cars = {car,car2,car3};
//for (int i = 0; i < cars.length; i++);
//cars[1].display();

        LoginCheck check = new LoginCheck();
        check.Check();

        StudentMarks marks = new StudentMarks();
            marks.Marks();
        }
    }

