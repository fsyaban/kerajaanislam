package com.fachrul.kerajaanislam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MateriActivity extends AppCompatActivity {

    private ImageView gambarkerajaan;
    private TextView tvnama,tvtahun,tvtempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        gambarkerajaan = findViewById(R.id.materigambar);
        tvnama = findViewById(R.id.materinama);
        tvtahun = findViewById(R.id.materitahun);
        tvtempat = findViewById(R.id.materitempat);

        int gambar = getIntent().getIntExtra("gambar",0);
        String nama = getIntent().getStringExtra("nama");
        String tahun = getIntent().getStringExtra("tahun");
        String tempat = getIntent().getStringExtra("tempat");

        gambarkerajaan.setImageResource(gambar);
        tvnama.setText(nama);
        tvtempat.setText(tempat);
        tvtahun.setText(tahun);


    }
}
