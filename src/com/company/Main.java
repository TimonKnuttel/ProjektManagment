package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Projekt a1 = new Projekt();
        a1.setStatus("In Progress");
        System.out.println(a1);



        Aufgabe auf1 = new Aufgabe(new Verantwortlicher());

        a1.setAufgabe(auf1);

        System.out.println(a1);

    }
}
