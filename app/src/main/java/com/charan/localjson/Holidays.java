package com.charan.localjson;

public class Holidays {
    final String name;
    final String date;

    public Holidays(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
