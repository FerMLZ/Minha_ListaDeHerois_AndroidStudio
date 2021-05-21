package br.com.local.listaherois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualizaHerois_MainActivity extends AppCompatActivity {

    TextView txtHerois;
    ImageView imgHerois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualiza_herois_layout);

        txtHerois = findViewById(R.id.mtxtHerois);
        imgHerois = findViewById(R.id.mimgHerois);

        //Receber o valor de outra janela
        Intent intent = getIntent();

        //Recebendo os valores pela variável declarada na janela de origem
        String nHerois = intent.getStringExtra("nomeHerois");
        int mHerois = intent.getIntExtra("imagemHerois",0);

        //Inserindo os valores nos componentes
        txtHerois.setText(nHerois);
        imgHerois.setImageResource(mHerois);
    }
}