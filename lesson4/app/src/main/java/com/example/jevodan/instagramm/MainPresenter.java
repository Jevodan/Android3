package com.example.jevodan.instagramm;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.jevodan.instagramm.model.Model;
import com.example.jevodan.instagramm.model.Photo;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private Model model;

    public MainPresenter() {
        this.model = new Model();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().showData(model.getData());
    }

    private void chosenOne() {
        model = new Model(true);
    }

    private void main() {
        model = new Model();
    }

    public void showChosen() {
        chosenOne();
        getViewState().showData(model.getData());
    }

    public void showMain() {
        main();
        getViewState().showData(model.getData());
    }

}
