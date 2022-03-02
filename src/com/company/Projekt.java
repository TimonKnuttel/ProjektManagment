package com.company;

public class Projekt {

    private String status;
    private Aufgabe aufgabe;
    private Projektleiter projektleiter;
    private Person mitglieder;

    /*public Projekt(String status, Projektleiter projektleiter) {
        this.status = status;
        this.projektleiter = projektleiter;
    }
    */

    @Override
    public String toString() {
        return "Projekt{" +
                "status='" + status + '\'' +
                ", aufgabe=" + aufgabe +
                ", projektleiter=" + projektleiter +
                ", mitglieder=" + mitglieder +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAufgabe(Aufgabe aufgabe) {
        this.aufgabe = aufgabe;
    }

    public void setMitglieder(Person mitglieder) {
        this.mitglieder = mitglieder;
    }

    public String getStatus() {
        return status;
    }

    public Aufgabe getAufgabe() {
        return aufgabe;
    }

    public Projektleiter getProjektleiter() {
        return projektleiter;
    }

    public Person getMitglieder() {
        return mitglieder;
    }
}