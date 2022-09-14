package com.julioprojects.appplantinhas.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.julioprojects.appplantinhas.R;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.MyViewHolder> {

    private List<Produto> produtoList;

    public AdapterProduto(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       Produto produto = produtoList.get(position);

       holder.namePlants.setText(produto.getNamePlants());
       holder.plantType.setText(produto.getPlantType());
       holder.plantDescription.setText(produto.getPlantDescription());


       holder.img_moister.setImageResource(Integer.valueOf(produto.getImg_moister()));
       holder.img_plant.setImageResource(Integer.valueOf(produto.getImg_plant()));






    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img_plant, img_moister;
        TextView namePlants, plantType, plantDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_plant = itemView.findViewById(R.id.img_plant);
            img_moister = itemView.findViewById(R.id.img_moister);

            namePlants = itemView.findViewById(R.id.namePlants);
            plantType = itemView.findViewById(R.id.plantType);
            plantDescription = itemView.findViewById(R.id.plantDescription);
        }
    }

}
