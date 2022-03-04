package com.company;

public class Aufgabe {

    private Person person;
    private int fertigstellungInProzent;

    public Aufgabe(Person person, int fertigstellung) {
        this.person = person;
        this.fertigstellungInProzent= fertigstellung;
    }

    public Person getVerantwortlicher() {
        return person;
    }

    public int getFertigstellungInProzent() {
        return fertigstellungInProzent;
    }

    public void setFertigstellungInProzent(int fertigstellungInProzent) {this.fertigstellungInProzent = fertigstellungInProzent;}

    @Override
    public String toString() {
        return "Aufgabe{" +
                "Person=" + person +
                ", fertigstellung=" + fertigstellungInProzent +
                '}';
    }
}
