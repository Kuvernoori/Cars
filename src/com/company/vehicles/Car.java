package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;
public class Car {
    String carBrand;
    String carClass;
    double weight;
   Engine engine;
   Driver driver;
    public Car(String carBrand, String carClass, double weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }
    public String toString() {
        return "Car: " + carBrand + ", Class - " + carClass + ", Weight - " + weight + "\n"
                + driver.toString() + "\n"
                + engine.toString();
    }
}
