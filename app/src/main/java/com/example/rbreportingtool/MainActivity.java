package com.example.rbreportingtool;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rbreportingtool.Application.Adapter.RecyclerDataViewMainMenuAdapter;
import com.example.rbreportingtool.Application.Model.DataMainMenuDto;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();

        RecyclerView idMainMenuRecyclerView = findViewById(R.id.idGridMenu);
        ArrayList<DataMainMenuDto> recyclerMainMenu = new ArrayList<>();
        recyclerMainMenu.add(new DataMainMenuDto("DSA",R.drawable.ic_menu));
        recyclerMainMenu.add(new DataMainMenuDto("JAVA",R.drawable.ic_menu));
        recyclerMainMenu.add(new DataMainMenuDto("C++",R.drawable.ic_menu));
        recyclerMainMenu.add(new DataMainMenuDto("C++",R.drawable.ic_menu));
        RecyclerDataViewMainMenuAdapter adapterMain = new RecyclerDataViewMainMenuAdapter(recyclerMainMenu);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 4);
        idMainMenuRecyclerView.setLayoutManager(layoutManager);
        idMainMenuRecyclerView.setAdapter(adapterMain);
    }
}