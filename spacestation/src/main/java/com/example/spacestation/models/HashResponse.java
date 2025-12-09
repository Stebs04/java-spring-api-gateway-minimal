package com.example.spacestation.models;

public class HashResponse {
    private String text;
    private String algorithm;
    private String hash;

    public HashResponse()
    {

    }

    public HashResponse(String text, String algorithm, String hash)
    {
        this.text = text;
        this.algorithm = algorithm;
        this.hash = hash;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public String getText() {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public void setAlgorithm(String algorithm)
    {
        this.algorithm = algorithm;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash()
    {
        return hash;
    }
}

