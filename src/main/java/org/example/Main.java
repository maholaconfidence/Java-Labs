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

        FullStack fullStack = new FullStack("Karabo", 54, "female");
        // fullStack.displayDetails();

        Car car = new Car("red", "Toyota", "Canry", 2020);
        Car car2 = new Car("black", "Honda", "Civic", 2022);
        Car car3 = new Car("white", "Ford", "Mustang", 2023);

//Car[] cars = {car,car2,car3};
//for (int i = 0; i < cars.length; i++);
//cars[1].display();

        LoginCheck check = new LoginCheck();
        check.Check();

        StudentMarks marks = new StudentMarks();
        marks.Marks();

        ArrayStatistics array = new ArrayStatistics(new int[]{5, 2, 10, 2, 15, 8, 25});
        array.display();
        ArraySearch search = new ArraySearch(new int[]{2, 1, 6, 8, 0, 0, 6, 5, 4, 3, 2, 5});
        search.getIndexNum(26);

        EvenOddArray EvenOddArray = new EvenOddArray(new int[]{4, 5, 6, 5, 4, 6, 5, 3, 5,});
        EvenOddArray.countNum();

        ReverseArray reverse = new ReverseArray(new int[]{1, 2, 3, 4, 5, 6});
        reverse.Reverse();

        Student student = new Student("Karabo", "367nokk", 67.0);
        student.displayDetails();
        student.hasPassed();

        Student student1 = new Student("Palesa", "jnj1", 70);
        Student student2 = new Student("Bongani", "ddn9", 90);

        student1.displayDetails();
        student1.hasPassed();
        student2.displayDetails();
        student2.hasPassed();

        BankAccount account = new BankAccount("Palesa", "1273899", 5900);
        BankAccount account1 = new BankAccount("Karabo", "127479", 60000);
        account.withDraw(89);
        account.getBalance();

        account1.deposit(5758);
        account1.getBalance();

        Rectangle rec1 = new Rectangle(23, 45);
        Rectangle rec2 = new Rectangle(2, 56);
        rec1.area();
        rec1.perimeter();
        rec2.area();
        rec2.perimeter();

        Product item = new Product("577", "laptop", 1, 1299);
        item.displayDetails();
        item.addStock(9);
        item.reduce(4);
        item.calcStockValue();


        Student5 studentOne = new Student5("367786", "Karabo", new double[]{50, 20, 40});
        studentOne.calcAvg();
        studentOne.hasPassed();
        studentOne.displaySummary();
        Student5 studentTwo = new Student5("367786", "Thabo", new double[]{50, 70, 80});
        studentTwo.calcAvg();
        studentTwo.hasPassed();
        studentTwo.displaySummary();
        Student5 studentThree = new Student5("367786", "Palesa", new double[]{60, 90, 80});
        studentThree.calcAvg();
        studentThree.hasPassed();
        studentThree.displaySummary();

        Product[] cart = {
                new Product5("Laptop", 850.00, 1),
                new Product5("Smartphone", 300.00, 2),
                new Product5("Headphones", -50.00, 1),
                new Product5("Mouse", 25.00, -3)



        };
    }

   // Exercise 6.1: Incorrect String comparison
   // Explain why the following code may print Different text, then correct it to compare String contents.

           // String first = new String("Java");
    //String second = new String("Java");

//if (first == second) {
      //  System.out.println("Same text");
  // } else {
   //     System.out.println("Different text");
  //  }
}

