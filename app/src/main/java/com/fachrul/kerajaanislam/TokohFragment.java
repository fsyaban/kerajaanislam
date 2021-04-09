package com.fachrul.kerajaanislam;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TokohFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<kerajaan> kerajaanArrayList;
    private LinearLayoutManager layoutManager;
    private RecyclerView.Adapter adapter;



    public static TokohFragment newInstance() {
        return  new TokohFragment();
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getData();
        View view = inflater.inflate(R.layout.fragment_tokoh, container, false);
        recyclerView = view.findViewById(R.id.rv);

        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new kerajaan_adapter(kerajaanArrayList,getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void getData(){
        kerajaanArrayList = new ArrayList<>();
        kerajaanArrayList.add(new kerajaan("Sumatera", R.drawable.sumatera));
        kerajaanArrayList.add(new kerajaan("Jawa", R.drawable.jawa));
        kerajaanArrayList.add(new kerajaan("Sulawesi", R.drawable.sulawesi));

    }

}
