package com.fachrul.kerajaanislam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<List> kerajaanArrayList;
    private LinearLayoutManager layoutManager;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getData();

        recyclerView = findViewById(R.id.list_rv);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new ListAdapter(kerajaanArrayList,this);
        recyclerView.setAdapter(adapter);
    }

    public void getData(){
        kerajaanArrayList = new ArrayList<>();
        kerajaanArrayList.add(new List("Kesultanan Demak","1951 - 1962","Sumatera", R.drawable.sumatera));
        kerajaanArrayList.add(new List("Kesultanan Jakarta","1951 - 1991","Sumatera", R.drawable.jawa));
        kerajaanArrayList.add(new List("Kesultanan Cirebon","1951 - Kini","Sumatera", R.drawable.sulawesi));
        kerajaanArrayList.add(new List("Kesultanan Samudera","1951 - Au","Sumatera", R.drawable.sumatera));


    }
}
