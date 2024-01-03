package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] datos = new String[]{"alojamiento","alimentacion y bebidas","atractivos culturales","Esparcimiento","compras"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, datos);
        Spinner cmbOpciones = (Spinner)findViewById(R.id.cdlugares);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);
        //listviwe
        final String[] datos2 = new String[]{"EXPLOMUNDO",
                "MULTICARIBE","XPLORA","CAFE Y TINTO","FANCY MINT COFFE & CAKE SHOP",
        "SWEET LAND","TORO CAFE"};
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos2);
        ListView lstOpciones = (ListView)findViewById(R.id.txtlugares);
        lstOpciones.setAdapter(adaptador2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem = (TextView)findViewById(R.id.textcategoria);
        txtItem.setText("categoria " +
                parent.getItemAtPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}