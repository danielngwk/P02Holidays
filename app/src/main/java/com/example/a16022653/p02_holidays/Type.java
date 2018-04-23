package com.example.a16022653.p02_holidays;

public class Type {
    private String name;
    private String date;
    private String image;

    public Type(String name, String date, String image) {
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }
}
