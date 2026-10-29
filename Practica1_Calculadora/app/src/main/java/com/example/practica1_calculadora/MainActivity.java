package com.example.practica1_calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        TextView textView1 = findViewById(R.id.textView1);
        int [] botones = {
                R.id.button0,
                R.id.button1,
                R.id.button2,
                R.id.button3,
                R.id.button4,
                R.id.button5,
                R.id.button6,
                R.id.button7,
                R.id.button8,
                R.id.button9,
                R.id.buttonmas,
                R.id.buttonrestar,
                R.id.buttonmultiplicar,
                R.id.buttondividir
        };

        for (int id : botones) {
            Button boton = findViewById(id);

            boton.setOnClickListener(v -> {
                Button pulsado = (Button) v;
                String texto = textView1.getText().toString();
                String nuevoTexto = pulsado.getText().toString();

                if (id == R.id.buttonmas || id == R.id.buttonrestar || id == R.id.buttonmultiplicar || id == R.id.buttondividir) {

                    if (texto.endsWith("+") ||
                            texto.endsWith("-") ||
                            texto.endsWith("*") ||
                            texto.endsWith("/")) {
                        return;
                    }
                }

                if (texto.equals("0")) {
                    textView1.setText(pulsado.getText());
                } else {
                    textView1.append(pulsado.getText());
                }
            });
        }


        Button botonBorrar = findViewById(R.id.buttonC);
        botonBorrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                String texto = textView1.getText().toString();
                if (!texto.isEmpty()) {
                    textView1.setText(texto.substring(0, texto.length() - 1));
                }

                if (textView1.getText().toString().isEmpty()) {
                    textView1.setText("0");
                }
            }

        });


        Button botonBTodo = findViewById(R.id.buttonAC);
        botonBTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("0");
            }
        });

        Button botonIgual = findViewById(R.id.buttonigual);
        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = textView1.getText().toString();

                if (texto.contains("+")) {
                    String[] numeros = texto.split("\\+");
                    double resultado = Double.parseDouble(numeros[0]) +
                            Double.parseDouble(numeros[1]);
                    textView1.setText(String.valueOf(resultado));

                } else if (texto.contains("-")) {
                    String[] numeros = texto.split("-");
                    double resultado = Double.parseDouble(numeros[0]) -
                            Double.parseDouble(numeros[1]);
                    textView1.setText(String.valueOf(resultado));

                } else if (texto.contains("*")) {
                    String[] numeros = texto.split("\\*");
                    double resultado = Double.parseDouble(numeros[0]) *
                            Double.parseDouble(numeros[1]);
                    textView1.setText(String.valueOf(resultado));

                } else if (texto.contains("/")) {
                    String[] numeros = texto.split("/");
                    double resultado = Double.parseDouble(numeros[0]) /
                            Double.parseDouble(numeros[1]);
                    textView1.setText(String.valueOf(resultado));
                }
            }
        });



        Button botonComa = findViewById(R.id.buttoncoma);
        botonComa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String texto = textView1.getText().toString();

                int inicio = Math.max(
                        Math.max(texto.lastIndexOf("+"), texto.lastIndexOf("-")),
                        Math.max(texto.lastIndexOf("×"), texto.lastIndexOf("÷"))
                );

                String numeroActual = texto.substring(inicio + 1);

                if (!numeroActual.contains(",")) {
                    textView1.append(",");
                }
            }
        });
        }


    }








