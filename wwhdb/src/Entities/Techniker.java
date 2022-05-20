package Entities;

import java.util.ArrayList;

public class Techniker extends Personal {
    ArrayList<Dienstaufzeichnung> dienste = new ArrayList<>();

    public Techniker() {

    }

    public Techniker(String id, String personalId, String passwort){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
    }

    public Techniker(String id, String name, String nachname, String filiale) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
    }

    public Techniker(String id, String personalId, String passwort, String name, String nachname, String filiale , String gaburtsdatum, String geschlecht, String adress, String telNr){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=gaburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.telNr=telNr;
    }

    //funktions of "dienst"
    public ArrayList<Dienstaufzeichnung> getDienste() {
        return dienste;
    }

    /*public Entities.Dienstaufzeichnung getDienst(int dienstId){
        //dienstId ile ilgili servis kayd� bulunacak ve geri d�nd�r�lecek
    }*/
    public void dienstAdd(Dienstaufzeichnung dienst) {
        dienste.add(dienst);
    }

    public void dienstLoschen(int dienstId) {
        //dienstId ile ilgili servis kayd� bulunacak ve silinecek
    }
}