package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Projekt a1 = new Projekt(10,new Person("Moritz", "Projektleiter"));
        Projekt a2 = new Projekt(0,new Person("Max", "Projektleiter"));
        Projekt a3 = new Projekt(99,new Person("LangFinger", "Projektleiter"));
        Projekt a4 = new Projekt(60,new Person("WeekDay", "Projektleiter"));

        System.out.println(a1);

        a1.newAufgabe(new Aufgabe(a1.getProjektleiter(),50));
        a1.newAufgabe(new Aufgabe(a2.getProjektleiter(),30));
        a1.newAufgabe(new Aufgabe(a2.getProjektleiter(),90));

        System.out.println(a1.getAufgaben().get(2).getFertigstellungInProzent());







    }
}
