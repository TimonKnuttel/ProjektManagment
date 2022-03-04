package com.company;

import java.util.ArrayList;
import java.util.List;

public class Projekt {

    private int status;
    private Aufgabe aufgabe;
    private Person person;
    private Person mitglieder;
    List<Aufgabe>aufgabenList = new ArrayList<>();

    public Projekt(int status, Person projektleiter) {
        setStatus(status);
        this.person = projektleiter;
    }


    @Override
    public String toString() {
        return "Projekt{" +
                "status='" + status + '\'' +
                ", aufgabe=" + aufgabe +
                ", person=" + person +
                ", mitglieder=" + mitglieder +
                '}';
    }

    public void setStatus(int status) {
        //Status muss zwischen 0-100 sein
        if (status>=0&&status<=100){
            this.status = status;
        }else throw new IllegalArgumentException("Liegt auserhalb von den Grenzen");
    }

    public void setMitglieder(Person mitglieder) {
        this.mitglieder = mitglieder;
    }

    public int getStatus() {
        return status;
    }

    public List<Aufgabe> getAufgaben() {
        return aufgabenList;
    }

    public Person getProjektleiter() {
        return person;
    }

    public Person getMitglieder() {
        return mitglieder;
    }


    public void newAufgabe (Aufgabe aufgabe){
        aufgabenList.add(aufgabe);
    }
}