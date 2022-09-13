package com.julioprojects.appplantinhas.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Adapter;

import com.julioprojects.appplantinhas.R;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPlants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerViewPlants = findViewById(R.id.recyclerPlants);




        recyclerViewPlants.setHasFixedSize(true);
        recyclerViewPlants.setLayoutManager(new LinearLayoutManager(this));
       // recyclerViewPlants.setAdapter();

    }
}