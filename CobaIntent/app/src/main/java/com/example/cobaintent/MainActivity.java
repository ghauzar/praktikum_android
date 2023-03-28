package com.example.cobaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        btnPindahActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_pindah_activity){
            Intent pindahIntent = new Intent(MainActivity.this, CobaIntent.class);
            startActivity(pindahIntent);
        }
    }
}