package com.example.projetomobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        configureBackButton();

        ListView lista = findViewById(R.id.listview);
        ArrayList<String> equipes = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);

        RegisterCompanyButton();
        consultorioButton();

    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Empresa teste 1");
        dados.add("Empresa teste 2");
        dados.add("Empresa 3 Teste");
        dados.add("Teste empresa 4");
        dados.add("5 Empresa teste");
        dados.add("6 Teste Empresa");
        return dados;
    }


    private void RegisterCompanyButton() {
        Button nextButton = findViewById(R.id.buttonRegisterCompany);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, cadastroActivity.class));
            }
        });

    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.buttonLogoff);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void consultorioButton() {
        Button nextButton = findViewById(R.id.buttonConsultorio);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ConsultaActivity.class));
            }
        });

    }
}