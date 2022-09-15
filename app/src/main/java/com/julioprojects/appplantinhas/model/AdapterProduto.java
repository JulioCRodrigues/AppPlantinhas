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

        holder.namePlants.setText(produto.getNome());
        holder.plantType.setText(produto.getTipo());
        holder.plantDescription.setText(produto.getDescricao());
        holder.img_plant.setImageResource(Integer.parseInt(String.valueOf(produto.getImagem())));


    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namePlants, plantType, plantDescription;
        ImageView img_plant;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namePlants = itemView.findViewById(R.id.namePlants);
            plantType = itemView.findViewById(R.id.plantType);
            plantDescription = itemView.findViewById(R.id.plantDescription);
            img_plant = itemView.findViewById(R.id.img_plant);
        }
    }

}
