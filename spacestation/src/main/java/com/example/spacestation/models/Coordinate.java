package com.example.spacestation.models;

/**
 * Classe che imposta le coordinate
 * @params latitudine che è la latitudine delle cordinate
 * @params longitudine che è la longitudine delle coordinate
 */
public class Coordinate{
    private double latitudine;
    private double longitudine;

    //Costruttore della classe
    public Coordinate(double latitudine, double longitudine)
    {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    //Metodi Getter e Setter

    public double getLatitudine() {
        return latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLatitudine(double latitudine)
    {
        this.latitudine = latitudine;
    }

    public void setLongitudine(double longitudine){
        this.longitudine = longitudine;
    }
}

