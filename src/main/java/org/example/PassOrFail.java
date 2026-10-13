package org.example;


public class PassOrFail {
    void learnerResults() {
        double mark = -777;
        String username = "Karabo";

        if (mark >= 80) {
            System.out.println(username + " You got distintion!!");

        }
        else if (mark >=70){
            System.out.println(username + " You got merit!!");
        }  else if (mark >=50){
            System.out.println(username + " You pass!");
        }  else if (mark >=49){
            System.out.println(username + " You fail");
        } else {
            System.out.println(username + " You entered invaild mark");
        }
    }
}



