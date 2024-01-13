package com.company.details;
public class Engine {
    int power;
    String manufacturer;
    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public String toString() {
        return "Power: " + power + " Manufacturer: " + manufacturer;
    }
}
