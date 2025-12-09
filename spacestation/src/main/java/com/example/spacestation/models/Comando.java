package com.example.spacestation.models;

public class Comando {
    private String codice;
    private String messaggio;

    public Comando()
    {

    }

    public Comando(String codice, String messaggio)
    {
        this.codice = codice;
        this.messaggio = messaggio;
    }

    public String getCodice(){return codice;}

    public String getMessaggio() {
        return messaggio;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
}
