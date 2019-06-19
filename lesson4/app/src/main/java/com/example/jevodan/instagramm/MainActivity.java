package com.example.jevodan.instagramm;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.jevodan.instagramm.model.Photo;
import com.example.jevodan.instagramm.recycler.PhotoRecyclerAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @BindView(R.id.recycler_photo)
    public RecyclerView recyclerView;

    @InjectPresenter
    MainPresenter mainPresenter;

    @OnClick(R.id.button_main)
    public void btnClick1() {
        mainPresenter.showMain();
    }

    @OnClick(R.id.button_all)
    public void btnClick2() {
        mainPresenter.showChosen();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /*
    @ProvidePresenter
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }
*/

    @Override
    public void showData(List<Photo> photoes) {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        PhotoRecyclerAdapter unitRecyclerAdapter = new PhotoRecyclerAdapter(photoes);
        recyclerView.setAdapter(unitRecyclerAdapter);
    }

}
