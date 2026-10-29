package com.example.tema4interfazusuario;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class Autocomplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Estos son los elementos que se sugerirán
        String[] opciones = {
                "Opcion1",
                "Opcion2",
                "Opcion3",
                "Opcion4",
                "Opcion5"
        };

        // Asociamos el AutoCompleteTextView creado en el XML
        AutoCompleteTextView textoLeido = findViewById(R.id.miTexto);

        // Creamos el adaptador para mostrar las sugerencias
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                opciones
        );

        // Asignamos el adaptador al AutoCompleteTextView
        textoLeido.setAdapter(adaptador);
    }
}