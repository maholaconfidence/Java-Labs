package org.example;

// Exercise 1.2: Shopping total
public class ShoppingTotal {
    static void main() {
        String productName = "laptop";
        double unitPrice = 1500;
        int quantity = 2;
        double discountPercent = 0.08;

        double totalCost = unitPrice * quantity;
        double discountAmount = totalCost * (discountPercent / 100);
        double finalAmount = totalCost - discountAmount;


            System.out.println(totalCost);
        System.out.println(discountAmount);
        System.out.println(finalAmount);


        }

    }


