package com.fachrul.kerajaanislam;

import android.content.Context;
import android.content.Intent;
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

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<List> listKerajaan;
    private Context context;

    public ListAdapter(ArrayList<List> listKerajaan, Context context) {
        this.context = context;
        this.listKerajaan = listKerajaan;

    }







    @NonNull
    @Override

    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.listvertikal, parent, false);
        return new ListAdapter.ListViewHolder(view);
    }


    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, final int position){


        //Set jdul dan gambar
        holder.tvnama.setText(listKerajaan.get(position).getNama());
        holder.tvtempat.setText(listKerajaan.get(position).getTempat());
        holder.tvtahun.setText(listKerajaan.get(position).getTahun());
        holder.gambarkerajaan.setImageResource(listKerajaan.get(position).getGambar());

        //pindah activity

        holder.item_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,  listKerajaan.get(position).getNama() , Toast.LENGTH_LONG).show();


                Intent pindah = new Intent(context,MateriActivity.class);
                pindah.putExtra("nama",listKerajaan.get(position).getNama());
                pindah.putExtra("tahun",listKerajaan.get(position).getTahun());
                pindah.putExtra("tempat",listKerajaan.get(position).getTempat());
                pindah.putExtra("gambar",listKerajaan.get(position).getGambar());

                context.startActivity(pindah);

            }
        });





    }

    @Override
    public int getItemCount(){
        return (listKerajaan!=null) ? listKerajaan.size() : 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        private TextView tvnama,tvtahun,tvtempat;
        private ImageView gambarkerajaan;
        private LinearLayout item_list;



        public ListViewHolder (View view){
            super(view);



            item_list = view.findViewById(R.id.item_list_vertikal);
            tvnama= view.findViewById(R.id.list_nama);
            tvtempat= view.findViewById(R.id.list_tempat);
            tvtahun= view.findViewById(R.id.list_tahun);
            gambarkerajaan = view.findViewById(R.id.list_gambar);





        }

    }
}
