package com.julioprojects.appplantinhas.activities;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.julioprojects.appplantinhas.R;
import com.julioprojects.appplantinhas.model.AdapterProduto;
import com.julioprojects.appplantinhas.model.Produto;
import com.julioprojects.appplantinhas.model.Users;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {

    private List<Produto> produtoList = new ArrayList<>();
    private RecyclerView rvProdutos;
    private AdapterProduto adapterProduto;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvProdutos = findViewById(R.id.rvProdutos);

        carregarLista();
        configRecyclerView();



    }

    private void configRecyclerView() {
        rvProdutos.setLayoutManager(new LinearLayoutManager(this));
        rvProdutos.setHasFixedSize(true);
        adapterProduto = new AdapterProduto(produtoList);
        rvProdutos.setAdapter(adapterProduto);

    }

     private void carregarLista() {
        Produto produto1 = new Produto();
        produto1.setImg_plant(R.id.img_plant);
        produto1.setImg_moister(R.id.img_moister);
        produto1.setNamePlants("Mya");
        produto1.setPlantType("Plant type");
        produto1.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         Produto produto2 = new Produto();
         produto2.setImg_plant(R.id.img_plant);
         produto2.setImg_moister(R.id.img_moister);
         produto2.setNamePlants("Mya");
         produto2.setPlantType("Plant type");
         produto2.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         Produto produto3 = new Produto();
         produto3.setImg_plant(R.id.img_plant);
         produto3.setImg_moister(R.id.img_moister);
         produto3.setNamePlants("Mya");
         produto3.setPlantType("Plant type");
         produto3.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         Produto produto4 = new Produto();
         produto4.setImg_plant(R.id.img_plant);
         produto4.setImg_moister(R.id.img_moister);
         produto4.setNamePlants("Mya");
         produto4.setPlantType("Plant type");
         produto4.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         Produto produto5 = new Produto();
         produto5.setImg_plant(R.id.img_plant);
         produto5.setImg_moister(R.id.img_moister);
         produto5.setNamePlants("Mya");
         produto5.setPlantType("Plant type");
         produto5.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         Produto produto6 = new Produto();
         produto6.setImg_plant(R.id.img_plant);
         produto6.setImg_moister(R.id.img_moister);
         produto6.setNamePlants("Mya");
         produto6.setPlantType("Plant type");
         produto6.setPlantDescription("Mya is a plant who likes sun\n and much water.");


         produtoList.add(produto1);
         produtoList.add(produto2);
         produtoList.add(produto3);
         produtoList.add(produto4);
         produtoList.add(produto5);
         produtoList.add(produto6);


     }

}