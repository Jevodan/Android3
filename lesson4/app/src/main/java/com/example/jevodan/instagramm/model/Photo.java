package com.example.jevodan.instagramm.model;

import java.util.List;

public class Photo {

    private int picture;
    private String desc;
    private boolean chosenOne;

    public Photo(int picture, String desc, boolean chosenOne) {
        this.picture = picture;
        this.desc = desc;
        this.chosenOne = chosenOne;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isChosenOne() {
        return chosenOne;
    }

    public void setChosenOne(boolean chosenOne) {
        this.chosenOne = chosenOne;
    }
}
