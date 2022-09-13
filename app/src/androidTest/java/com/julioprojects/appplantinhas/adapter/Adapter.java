

package com.julioprojects.appplantinhas.adapter;


        import android.view.LayoutInflater;
        import android.view.View;

        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;



        import androidx.recyclerview.widget.RecyclerView;

        import com.julioprojects.appplantinhas.R;

public class Adapter  extends RecyclerView.Adapter<Adapter .MyViewHolder> {



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemView);



        return null;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        holder.nome.setText("Mya");
        holder.tipo.setText("Plant type");
        holder.descricao.setText("Mya is a plant who likes sun\\n and much water.");
        holder.imagem.setImageResource(R.id.img_plant);
        holder.moister.setImageResource(R.id.img_moister);





    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        TextView descricao;
        TextView tipo;


        ImageView moister;
        ImageView imagem;

        public MyViewHolder( View itemView) {


            nome = itemView.findViewById(R.id.namePlants);
            tipo = itemView.findViewById(R.id.plantType);
            descricao = itemView.findViewById(R.id.plantDescription);
            tipo = itemView.findViewById(R.id.plantType);
            moister = itemView.findViewById(R.id.img_moister);
            imagem = itemView.findViewById(R.id.img_plant);

            super(itemView);
        }
    }


}
