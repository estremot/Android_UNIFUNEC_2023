package com.example.projeto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnMensagem = findViewById(R.id.btn_Mensagem);
        Button btnLimpar = findViewById(R.id.btn_Limpar);
        TextView txtMensagem = findViewById(R.id.txt_Mensagem);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMensagem.setText("");

                btnLimpar.setEnabled(false);
                btnMensagem.setEnabled(true);
            }
        });

        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMensagem.setText("ADS - UNIFUNEC - 2023");
                btnLimpar.setEnabled(true);
                btnMensagem.setEnabled(false);
            }
        });
    }
}