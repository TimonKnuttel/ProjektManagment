package com.company;

import java.util.Scanner;

public class Main {

    public void addProjekt (){
        System.out.println("Gib den Namen des Projektleiters ein");
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die Funktion des Projektleiters ein");
        Scanner sb = new Scanner(System.in);
        System.out.println(new Projekt(0,new Projektleiter(sc.toString(),sb.toString())));
    }

    public static void main(String[] args) {
	// write your code here

        Projekt a1 = new Projekt(10,new Projektleiter("Moritz", "Projektleiter"));
        Projekt a2 = new Projekt(0,new Projektleiter("Max", "Projektleiter"));
        Projekt a3 = new Projekt(99,new Projektleiter("LangFinger", "Projektleiter"));
        Projekt a4 = new Projekt(60,new Projektleiter("WeekDay", "Projektleiter"));

        System.out.println(a1);

        a1.addAufgabe(new Aufgabe(a1.getProjektleiter(),50));
        a1.addAufgabe(new Aufgabe(a2.getProjektleiter(),30));
        a1.addAufgabe(new Aufgabe(a2.getProjektleiter(),90));
        a1.addMitglieder(new Mitarbeiter("Felix","Bauarbeiter"));
        System.out.println(a1.getAllePerosonen());

        System.out.println(a1.getDurschnittVonProgress());

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib den Namen des Projektleiters ein");
        String name = sc.nextLine();
        System.out.println("Gib die Funktion des Projektleiters ein");
        String funktion = sc.nextLine();
        new Projekt(0,new Projektleiter(name,funktion));
    }
}
