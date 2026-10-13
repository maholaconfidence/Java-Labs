package org.example;

public class TemperatureConverter {
    static void main() {
        double Celsius = 30;
        double Fahrenheit = (Celsius * 90/5) + 32;
        double FahrenheitToCelsius = (Fahrenheit - 32) * 5/ 90 ;

        System.out.println("Temperature in Celsuis:" + Celsius +"℃");
        System.out.println("Temperature in Fahrenheit:" + Fahrenheit +"℉");
        System.out.println("Fahrenheit to Celsius:" + FahrenheitToCelsius  +"℃");




    }
}
