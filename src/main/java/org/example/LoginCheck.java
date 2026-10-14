package org.example;

public class LoginCheck {
    void Check() {
        String Expusername = "mahola4@gmail.com";
        String Exppassword = "TTKKI5@123";
        String userName = "mahola4@gmail.com";
        String password = "TTKKI5@123";


        if (userName.equals(Expusername) && password.equals(Exppassword)) {
            System.out.println("Login Succesfull!");
        } else {
            System.out.println("Invalid credentails");
        }

    }
}
