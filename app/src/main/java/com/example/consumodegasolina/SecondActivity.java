package com.example.consumodegasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final TextView txtResposta = findViewById(R.id.activity_second_txt_resposta);
        Bundle dados = getIntent().getExtras();
        float media = dados.getFloat("Media");
        txtResposta.setText( String.valueOf("Será consumido "+ media+"L"));
    }
}
