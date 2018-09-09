package com.f_secure.model.homePage;


public enum Country {

    Polska("Polska"),
    UK("UK"),
    FR("France"),
    USA("USA");

    private final String name;

    Country(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
