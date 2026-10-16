
//Exercise 4.3: Product inventory
//Create a Product class with product ID, name, price, and stock quantity. Add methods to display details, add stock, reduce stock after a sale, and calculate stock value (price * quantity). Do not allow sales that exceed available stock.
package org.example;

public class Product {
    String productID;
    String productName;
    int stockQuantity;
    double price;

    Product(String productID, String productName, int stockQuantity,double price){
        this.productID = productID;
        this.productName = productName;
        this.stockQuantity = stockQuantity;
        this.price = price;

    }
    void displayDetails(){
        System.out.println(this.productID + " "+ this.productName + " " + this.stockQuantity + " " + this.price);
    }
    void  addStock( int quantity){
        if (stockQuantity > 0){
            this.stockQuantity += quantity;
            System.out.println("Added " + quantity + " New stock quantity " + this.stockQuantity);
        }
        else {
            System.out.println("stock quantity must be greater than zero");
        }

    }
    void reduce(int quantity){
        if (stockQuantity <= 0){
            System.out.println("Stock quantity must be greater than zero");
        }
        else if (quantity > this.stockQuantity) {
            System.out.println("Cannot sell: " + quantity + " Remaining units: " + this.stockQuantity);
        }
        else{
            this.stockQuantity -= quantity;
            System.out.println("Sale Successful!: " + quantity + " Remaining units " + this.stockQuantity);
        }

    }
    void calcStockValue(){
        double stockValue;
        stockValue =  this.price * this.stockQuantity;
        System.out.println( "Stock value in rands "+ "R"+stockValue);
    }


}
