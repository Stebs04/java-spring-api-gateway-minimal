package com.example.spacestation.models;

public class Astronauta{
    private String nome;
    private String ruolo;

    public Astronauta(String nome, String ruolo)
    {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public String getNome(){return nome;}
    public String getRuolo(){return ruolo;}

    public void setNome(String nome_u)
    {
        this.nome = nome_u;
    }

    public void setRuolo(String ruolo_u)
    {
        this.ruolo = ruolo_u;
    }
}