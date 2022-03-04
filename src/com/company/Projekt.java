package com.company;

import java.util.ArrayList;
import java.util.List;

public class Projekt {

    private int status;
    private Projektleiter projektleiter;
    private List<Mitarbeiter>maList = new ArrayList<>();
    private List<Aufgabe>aufgabenList = new ArrayList<>();

    public Projekt(int status, Projektleiter projektleiter) {
        setStatus(status);
        this.projektleiter = projektleiter;
    }


    @Override
    public String toString() {
        return "Projekt{" +
                "status='" + status + '\'' +
                ", person=" + projektleiter +
                ", mitglieder=" + maList.toString() +
                '}';
    }

    public void setStatus(int status) {
        //Status muss zwischen 0-100 sein
        if (status>=0&&status<=100){
            this.status = status;
        }else throw new IllegalArgumentException("Liegt auserhalb von den Grenzen");
    }

    public int getStatus() {return status;}

    public List<Aufgabe> getAufgaben() {
        return aufgabenList;
    }

    public void addAufgabe(Aufgabe aufgabe){aufgabenList.add(aufgabe);}

    public void addMitglieder(Mitarbeiter mitglied) {this.maList.add(mitglied);}

    public Projektleiter getProjektleiter() {return projektleiter;}

    public List<Mitarbeiter> getMA() {return maList;}

    public List<Person> getAllePerosonen(){
        List<Person>allePersonen = new ArrayList<>();
        for (int i=0; i<maList.size();i++){
            allePersonen.add(maList.get(i));
        }
        allePersonen.add(projektleiter);
        return allePersonen;
    }

    public double getDurschnittVonProgress (){
        double durchschnitt=0;
        for (int i=0; i<aufgabenList.size();i++){
            durchschnitt+=getAufgaben().get(i).getFertigstellungInProzent();
        }
        return durchschnitt/aufgabenList.size();
    }
}