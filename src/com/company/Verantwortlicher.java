package com.company;

public class Verantwortlicher {

    private Aufgabe aufgabe;

    public Aufgabe getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(Aufgabe aufgabe) {
        this.aufgabe = aufgabe;
    }

    @Override
    public String toString() {
        return "Verantwortlicher{" +
                "aufgabe=" + aufgabe +
                '}';
    }
}
