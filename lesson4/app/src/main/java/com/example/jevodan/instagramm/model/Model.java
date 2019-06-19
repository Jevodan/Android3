package com.example.jevodan.instagramm.model;

import com.example.jevodan.instagramm.R;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Photo> data;

    public Model() {
        data = new ArrayList<>();
        data.add(new Photo(R.drawable.paladin, "Картинка1", false));
        data.add(new Photo(R.drawable.mage, "Картинка2", false));
        data.add(new Photo(R.drawable.succubus, "Картинка3", false));
        data.add(new Photo(R.drawable.valkyri, "Картинка4", false));
    }

    public Model(Boolean One) {
        data = new ArrayList<>();
        data.add(new Photo(R.drawable.paladin, "Картинка1", false));
        data.add(new Photo(R.drawable.mage, "Картинка2", false));
        data.add(new Photo(R.drawable.succubus, "Картинка3", false));
        data.add(new Photo(R.drawable.valkyri, "Картинка4", false));
        data.add(new Photo(R.drawable.eldervampire, "Картинка5", true));
        data.add(new Photo(R.drawable.paladin, "Картинка6", true));
    }


    public List<Photo> getData() {
        return data;
    }
}
