package Entities;

import java.util.ArrayList;

public class Kunde extends Person {
    ArrayList<Dienstaufzeichnung> dienste = new ArrayList<>();
    ArrayList<Verkaufaufzeichnung> verkaeufe = new ArrayList<>();

    public Kunde() {

    }

    public Kunde(String id) {
        this.id = id;
    }

    public Kunde(String id, String name, String nachname, String filiale) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
    }

    public Kunde(String id, String name, String nachname, String filiale, String gaburtsdatum, String geschlecht, String adress, String tel_nr) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
        this.geburtsdatum = gaburtsdatum;
        this.geschlecht = geschlecht;
        this.adress = adress;
        this.tel_nr = tel_nr;
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

    //funktions of "verkauf"
    public ArrayList<Verkaufaufzeichnung> getVerkaeufe() {
        return verkaeufe;
    }

    /*public Entities.Verkaufaufzeichnung getVerkauf(int verkaufId){
        //verkaufId ile ilgili sat�� kayd� bulunacak ve geri d�nd�r�lecek
    }*/
    public void verkaufAdd(Verkaufaufzeichnung verkauf) {
        verkaeufe.add(verkauf);
    }

    public void verkaufLoschen(int verkaufId) {
        //verkaufId ile ilgili sat�� kayd� bulunacak ve silinecek
    }

}
