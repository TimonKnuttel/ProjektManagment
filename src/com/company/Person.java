package com.company;

public class Person {

    private String name;
    private String funktion;

    public Person(String name, String funktion) {
        this.name = name;
        this.funktion = funktion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", funktion='" + funktion + '\'' +
                '}';
    }
}
