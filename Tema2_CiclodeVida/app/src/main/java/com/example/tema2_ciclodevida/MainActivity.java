package com.example.tema2_ciclodevida;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ejemplo", "Estoy en onCreate");
        }
    protected void onStart() {
        super.onStart();
        Log.i("Ejemplo", "Estoy en onStart");
    }


    protected void onRestart() {
        super.onRestart();
        Log.i("Ejemplo", "Estoy en onRestart");
    }


    protected void onResume() {
        super.onResume();
        Log.i("Ejemplo", "Estoy en onResume");
    }


    protected void onPause() {
        super.onPause();
        Log.i("Ejemplo", "Estoy en onPause");
    }


    protected void onStop() {
        super.onStop();
        Log.i("Ejemplo", "Estoy en onStop");
    }


    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ejemplo", "Estoy en onDestroy");
    }
}
