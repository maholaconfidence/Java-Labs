//Exercise 4.4: Rectangle
//Create a Rectangle class with width and height. Add methods for area (width * height) and perimeter (2 * (width + height)). Create two objects with different dimensions and display the resultsCreate a Rectangle class with width and height. Add methods for area (width * height) and perimeter (2 * (width + height)). Create two objects with different dimensions and display the results.
//Create a Rectangle class with width and height. Add methods for area (width * height) and perimeter (2 * (width + height)). Create two objects with different dimensions and display the results.
package org.example;

public class Rectangle {

    int width;
    int height;
    int Area;
    int Perimeter;


    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void area() {
        if (width > 0 && height > 0) {
            Area = width * height;
            System.out.println("Area of a rectangular:" + " " + Area);
        } else {
            System.out.println("Width and height must be greater than zero");
        }

    }
    void perimeter() {
        if (width > 0 && height > 0) {
            Perimeter = (2 * (width + height));
            System.out.println("Perimeter of rectangle:" + " " + Perimeter);
        }

    }
}
