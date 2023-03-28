package com.example.cariluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView tvHasil;
    private static final String STATE_HASIL = "state_hasil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = findViewById(R.id.isi_panjang);
        edtLebar = findViewById(R.id.isi_lebar);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(this);


        if (savedInstanceState != null) {
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tvHasil.setText(hasil);
        }
    }
    @Override
    public void onClick(View v){
            if (v.getId() == R.id.btn_hitung){
                String inputPanjang = edtPanjang.getText().toString().trim();
                String inputLebar = edtLebar.getText().toString().trim();

                boolean isEmptyFields = false;

                if(TextUtils.isEmpty(inputPanjang)) {
                    isEmptyFields = true;
                    edtPanjang.setError("Tuliskan panjang persegi panjang");
                }

                if(TextUtils.isEmpty(inputLebar)){
                    isEmptyFields = true;
                    edtLebar.setError("Tuliskan lebar persegi panjang");
                }

                if(!isEmptyFields){
                    double luas = Double.valueOf(inputPanjang) * Double.valueOf(inputLebar);
                    tvHasil.setText(String.valueOf(luas));
                }
            }
        }
        @Override
        protected void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);
            outState.putString(STATE_HASIL, tvHasil.getText().toString());
        }
    }
