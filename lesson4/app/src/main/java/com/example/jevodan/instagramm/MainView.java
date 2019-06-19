package com.example.jevodan.instagramm;

import com.arellomobile.mvp.MvpView;
import com.example.jevodan.instagramm.model.Photo;

import java.util.List;

public interface MainView extends MvpView {

    void showData(List<Photo> photoes);

}
