package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
   double topSpeed;

    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine engine, double topSpeed) {
        super(carBrand, carClass, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public String toString() {
        return super.toString() + "\nTop Speed - " + topSpeed + " km/h";
    }
}
