package com.example.basedul.toplevelsoftwarecomapany;

import android.content.Context;

class AllInformation {
    private String s, s1;
    private int image;
    public AllInformation(String s, String s1, int image) {
        this.s = s;
        this.s1 = s1;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getS() {
        return s;
    }

    public String getS1() {
        return s1;
    }
}
