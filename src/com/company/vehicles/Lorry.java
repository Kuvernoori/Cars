package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    double carryingCapacity;

    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine engine, double carryingCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }


    public String toString() {
        return super.toString() + "\nCarrying Capacity - " + carryingCapacity + " tons";
    }
}
