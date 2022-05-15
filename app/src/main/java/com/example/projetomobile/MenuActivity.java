package com.example.projetomobile;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projetomobile.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView lista = findViewById(R.id.listview);
        ArrayList<String> equipes = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);

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

}