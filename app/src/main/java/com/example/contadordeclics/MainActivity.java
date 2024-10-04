package com.example.contadordeclics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.contadordeclics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorTotal;
    int contador1;
    int contador2;
    int contador3;
    int contador4;

    /*
    // Probado con método normal sin binding
    TextView contadorDeClicsTotal;
    TextView contadorDeClics1;
    TextView contadorDeClics2;
    TextView contadorDeClics3;
    TextView contadorDeClics4;

    Button aumentarElContador1;
    Button aumentarElContador2;
    Button aumentarElContador3;
    Button aumentarElContador4;

    Button resetContadorTotal;
    Button resetContador1;
    Button resetContador2;
    Button resetContador3;
    Button resetContador4;
    */

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);

        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        /*
        // Probado con método normal sin binding
        contadorDeClics1 = findViewById(R.id.contador1);
        contadorDeClics2 = findViewById(R.id.contador2);
        contadorDeClics3 = findViewById(R.id.contador3);
        contadorDeClics4 = findViewById(R.id.contador4);
        contadorDeClicsTotal = findViewById(R.id.contadorTotal);

        aumentarElContador1 = findViewById(R.id.aumentar1);
        aumentarElContador2 = findViewById(R.id.aumentar2);
        aumentarElContador3 = findViewById(R.id.aumentar3);
        aumentarElContador4 = findViewById(R.id.aumentar4);

        resetContador1 = findViewById(R.id.botonReset1);
        resetContador2 = findViewById(R.id.botonReset2);
        resetContador3 = findViewById(R.id.botonReset3);
        resetContador4 = findViewById(R.id.botonReset4);
        resetContadorTotal = findViewById(R.id.botonResetTotal);
        */


        binding.aumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                contadorTotal++;
                binding.contador1.setText(""+contador1+"");
                binding.contadorTotal.setText(""+contadorTotal+"");
            }
        });

        binding.aumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                contadorTotal++;
                binding.contador2.setText(""+contador2+"");
                binding.contadorTotal.setText(""+contadorTotal+"");
            }
        });

        binding.aumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                contadorTotal++;
                binding.contador3.setText(""+contador3+"");
                binding.contadorTotal.setText(""+contadorTotal+"");
            }
        });

        binding.aumentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                contadorTotal++;
                binding.contador4.setText(""+contador4+"");
                binding.contadorTotal.setText(""+contadorTotal+"");
            }
        });

        binding.botonReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1=0;
                binding.contador1.setText(""+contador1+"");
            }
        });

        binding.botonReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2=0;
                binding.contador2.setText(""+contador2+"");
            }
        });

        binding.botonReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3=0;
                binding.contador3.setText(""+contador3+"");
            }
        });

        binding.botonReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4=0;
                binding.contador4.setText(""+contador4+"");
            }
        });

        binding.botonResetTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1=0;
                contador2=0;
                contador3=0;
                contador4=0;
                contadorTotal=0;
                binding.contador1.setText(""+contador1+"");
                binding.contador2.setText(""+contador2+"");
                binding.contador3.setText(""+contador3+"");
                binding.contador4.setText(""+contador4+"");
                binding.contadorTotal.setText(""+contadorTotal+"");
            }
        });

    }
}