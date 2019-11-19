package com.example.consumodegasolina;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    TextView txtDistancia;
    TextView txtConsumo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDistancia = findViewById(R.id.activity_main_txt_distancia);
        txtConsumo = findViewById(R.id.activity_main_txt_consumo);
        btnCalcular = findViewById(R.id.activity_main_btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float distancia = Float.parseFloat( txtDistancia.getText().toString() );
                float consumo = Float.parseFloat( txtConsumo.getText().toString() );
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                float media = distancia / consumo;
                intent.putExtra("Media",media);
                startActivity(intent);

            }
        });
    }
}
