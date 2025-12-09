package com.example.spacestation.models;

public class HashRequest {
    private String text;
    private String algorithm;

    public HashRequest()
    {

    }

    public HashRequest(String text, String algorithm)
    {
        this.text = text;
        this.algorithm = algorithm;
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
}
