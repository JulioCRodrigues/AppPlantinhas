package com.julioprojects.appplantinhas.activities;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.julioprojects.appplantinhas.R;
import com.julioprojects.appplantinhas.model.AdapterProduto;
import com.julioprojects.appplantinhas.model.Produto;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {

    private AdapterProduto adapterProduto;
    private List<Produto> produtoList = new ArrayList<>();
    private RecyclerView rvProdutos;
    private BottomNavigationItemView settings;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvProdutos = findViewById(R.id.rvProdutos);
        settings = findViewById(R.id.item3);


        carregaLista();
        configRecyclerView();


        settings.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(intent);
        });


    }





    private void configRecyclerView(){
        rvProdutos.setLayoutManager(new LinearLayoutManager(this));
        rvProdutos.setHasFixedSize(true);
        adapterProduto = new AdapterProduto(produtoList);
        rvProdutos.setAdapter(adapterProduto);



    }

    private void carregaLista(){

        Produto produto1 = new Produto();
        produto1.setNome("Mya");
        produto1.setTipo("Plant type");
        produto1.setDescricao("Mya is a plant who likes sun and much water.");
        produto1.setImagem(R.drawable.img_card);



        Produto produto2 = new Produto();
        produto2.setNome("Joe");
        produto2.setTipo("Plant type");
        produto2.setDescricao("Joe is a plant who likes sun and much water.");
        produto2.setImagem(R.drawable.img_card2);


        Produto produto3 = new Produto();
        produto3.setNome("Mya");
        produto3.setTipo("Plant type");
        produto3.setDescricao("Mya is a plant who likes sun and much water.");
        produto3.setImagem(R.drawable.img_card);



        Produto produto4 = new Produto();
        produto4.setNome("Joe");
        produto4.setTipo("Plant type");
        produto4.setDescricao("Joe is a plant who likes sun and much water.");
        produto4.setImagem(R.drawable.img_card2);


        Produto produto5 = new Produto();
        produto5.setNome("Mya");
        produto5.setTipo("Plant type");
        produto5.setDescricao("Mya is a plant who likes sun and much water.");
        produto5.setImagem(R.drawable.img_card);



        Produto produto6 = new Produto();
        produto6.setNome("Joe");
        produto6.setTipo("Plant type");
        produto6.setDescricao("Joe is a plant who likes sun and much water.");
        produto6.setImagem(R.drawable.img_card2);










        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        produtoList.add(produto6);




    }



}