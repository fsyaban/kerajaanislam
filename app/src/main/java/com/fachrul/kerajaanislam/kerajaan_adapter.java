package com.fachrul.kerajaanislam;

import android.content.Intent;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class kerajaan_adapter extends RecyclerView.Adapter<kerajaan_adapter.kerajaanViewHolder> {

    private ArrayList<kerajaan> listKerajaan;
    private Context context;

    public kerajaan_adapter(ArrayList<kerajaan> listKerajaan, Context context) {
        this.context = context;
        this.listKerajaan = listKerajaan;

    }







    @NonNull
    @Override

    public kerajaanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemkerajaan, parent, false);
        return new kerajaanViewHolder(view);
    }


    public void onBindViewHolder(@NonNull kerajaanViewHolder holder, final int position){


        //Set jdul dan gambar
        holder.tvkerajaan.setText(listKerajaan.get(position).getKerajaan());
        holder.gambarkerajaan.setImageResource(listKerajaan.get(position).getGambar());

        //pindah activity

        holder.item_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context,  listKerajaan.get(position).getKerajaan() , Toast.LENGTH_LONG).show();

                Intent pindah = new Intent(context,ListActivity.class);
                context.startActivity(pindah);

            }
        });





    }

    @Override
    public int getItemCount(){
        return (listKerajaan!=null) ? listKerajaan.size() : 0;
    }

    public class kerajaanViewHolder extends RecyclerView.ViewHolder{

        private TextView tvkerajaan;
        private ImageView gambarkerajaan;
        private LinearLayout item_list;
        private Context context;
        private Integer position;

        public kerajaanViewHolder (View view){
            super(view);

            position = getAdapterPosition();
            context= view.getContext();
            item_list = view.findViewById(R.id.itemlist);
            tvkerajaan= view.findViewById(R.id.tvxkerajaan);
            gambarkerajaan = view.findViewById(R.id.gambarx);





        }

    }
}