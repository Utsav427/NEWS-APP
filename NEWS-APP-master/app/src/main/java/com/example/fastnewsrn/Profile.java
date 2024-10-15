package com.example.fastnewsrn;

public class Profile {

    private String name;
    private int imageResource;

    public Profile(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}
