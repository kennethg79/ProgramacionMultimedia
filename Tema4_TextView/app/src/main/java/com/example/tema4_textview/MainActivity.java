package com.example.tema4_textview;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView miTexto = findViewById(R.id.texto);

        // Cambiar el texto
        miTexto.setText("Nuevo texto a mostrar");

        // Opción 1 para cambiar el color
        miTexto.setTextColor(Color.parseColor("#0000FF"));

        // Opción 2 para cambiar el color
        miTexto.setTextColor(Color.RED);

        // Cambiar el texto a cursiva
        miTexto.setTypeface(null, Typeface.ITALIC);

        // Cambiar el tamaño del texto
        miTexto.setTextSize(24);

        // Cambiar tipo de letra
        miTexto.setTypeface(Typeface.SANS_SERIF);
    }
}