package com.company.professions;

public class Driver extends Person {
    int drivingExperience; // in years

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return super.toString() + ", Driving Experience: " + drivingExperience + " years";
    }
}
