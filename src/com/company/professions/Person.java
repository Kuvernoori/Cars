package com.company.professions;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String toString() {
        return "Person: " + fullName + ", Age: " + age;
    }
}
