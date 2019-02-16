package com.example.sree.ieee;

public class ListItem {


    private int backgroundImage;
    private int image;
    private String text ;


    public ListItem(int id, int image, String text) {
        this.backgroundImage = id;
        this.image = image;
        this.text = text;
    }

    public int getId() {
        return backgroundImage;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }





}
