package org.example;

public class Car1 {
    private String make;
    private String model;
    private int year;

    Car1(String make, String model, int year) {
        this.setMake(make);
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;

    }

    public int getYear() {
        return year;
    }

    public String setMake(String make) {
        this.make = make;
        return make;
    }

}



