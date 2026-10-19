//Create a Product class with name, price, and quantity. In the main class, create an array of at least four products, calculate line totals and the subtotal, apply a 10% discount if the subtotal exceeds 1,000, and display a receipt with line totals, subtotal, discount, and final total.
// Challenge: Reject negative prices and quantities.

package org.example;

public class Product5 {
    String name;
    double price;
    int quantity;
    double lineTotal;

    Product5(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if(price <  0 || quantity <0);
        System.out.println("price cannot be negative");

    }


    void  getLineTotal(){
        lineTotal = price * quantity;
        System.out.println("Line total: " + lineTotal);
    }


}
