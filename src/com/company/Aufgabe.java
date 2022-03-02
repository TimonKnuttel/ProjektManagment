package com.company;

public class Aufgabe {

    private Verantwortlicher verantwortlicher;
    private int fertigstellung;

    public Aufgabe(Verantwortlicher verantwortlicher) {
        this.verantwortlicher = verantwortlicher;
    }

    public Verantwortlicher getVerantwortlicher() {
        return verantwortlicher;
    }

    public int getFertigstellung() {
        return fertigstellung;
    }

    public void setFertigstellung(int fertigstellung) {
        this.fertigstellung = fertigstellung;
    }

    @Override
    public String toString() {
        return "Aufgabe{" +
                "verantwortlicher=" + verantwortlicher +
                ", fertigstellung=" + fertigstellung +
                '}';
    }
}
