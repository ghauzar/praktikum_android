package com.example.ghauzar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CobaIntent extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_intent);
        Button btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        Button btnPindahDataDiri = findViewById(R.id.btn_pindah_datadiri);
        btnPindahActivity.setOnClickListener(this);
        btnPindahDataDiri.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_pindah_activity){
            Intent pindahIntent = new Intent(CobaIntent.this, MainActivity.class);
            startActivity(pindahIntent);
        } else if (v.getId() == R.id.btn_pindah_datadiri) {
            Intent pindahIntent = new Intent(CobaIntent.this, DataDiri.class);
            startActivity(pindahIntent);
        }


    }
}