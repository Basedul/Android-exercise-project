package com.example.basedul.recyclerviewpractise;

public class MainInformation {
    private int image;
    private String titleText, descriptionText;


    public MainInformation(int image, String titleText, String descriptionText) {
        this.image = image;
        this.titleText = titleText;
        this.descriptionText = descriptionText;
    }
    public int getImage() {
        return image;
    }

    public String getTitleText() {
        return titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

}
