package Entities;

import Entities.Aufzeichnung;

public class Dienstaufzeichnung extends Aufzeichnung {
    String bericht;

    //getters and setters
    public String getBericht() {
        return bericht;
    }
    public void setBericht(String bericht) {
        this.bericht = bericht;
    }
}