package com.example.dungeonsdados;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.dungeonsdados.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    int cuentaD4 = 0;
    int cuentaD6 = 0;
    int cuentaD8 = 0;
    int cuentaD10 = 0;
    int cuentaD12 = 0;
    int cuentaD20 = 0;
    int cuentaD100 = 0;
    int totalResultado = 0;
    int random;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("cuentaD4", cuentaD4);
        savedInstanceState.putInt("cuentaD6", cuentaD6);
        savedInstanceState.putInt("cuentaD8", cuentaD8);
        savedInstanceState.putInt("cuentaD10", cuentaD10);
        savedInstanceState.putInt("cuentaD12", cuentaD12);
        savedInstanceState.putInt("cuentaD20", cuentaD20);
        savedInstanceState.putInt("cuentaD100", cuentaD100);
        savedInstanceState.putInt("totalResultado", totalResultado);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        if (savedInstanceState != null) {
            cuentaD4 = savedInstanceState.getInt("cuentaD4");
            cuentaD6 = savedInstanceState.getInt("cuentaD6");
            cuentaD8 = savedInstanceState.getInt("cuentaD8");
            cuentaD10 = savedInstanceState.getInt("cuentaD10");
            cuentaD12 = savedInstanceState.getInt("cuentaD12");
            cuentaD20 = savedInstanceState.getInt("cuentaD20");
            cuentaD100 = savedInstanceState.getInt("cuentaD100");
            totalResultado = savedInstanceState.getInt("totalResultado");

            // Actualizar las vistas con los valores restaurados
            binding.idTiradasd4.setText(String.valueOf(cuentaD4));
            binding.idTiradasd6.setText(String.valueOf(cuentaD6));
            binding.idTiradasd8.setText(String.valueOf(cuentaD8));
            binding.idTiradasd10.setText(String.valueOf(cuentaD10));
            binding.idTiradasd12.setText(String.valueOf(cuentaD12));
            binding.idTiradasd20.setText(String.valueOf(cuentaD20));
            binding.idTiradasd100.setText(String.valueOf(cuentaD100));
            binding.idTotalResultado.setText(String.valueOf(totalResultado));
        }

        binding.idD4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD4++;
                binding.idTiradasd4.setText(String.valueOf(cuentaD4));
                random = (int) (Math.random()*4);
                totalResultado = totalResultado + random;
                binding.idResultadod4.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD6++;
                binding.idTiradasd6.setText(String.valueOf(cuentaD6));
                random = (int) (Math.random()*6);
                totalResultado = totalResultado + random;
                binding.idResultadod6.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD8++;
                binding.idTiradasd8.setText(String.valueOf(cuentaD8));
                random = (int) (Math.random()*8);
                totalResultado = totalResultado + random;
                binding.idResultadod8.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD10++;
                binding.idTiradasd10.setText(String.valueOf(cuentaD10));
                random = (int) (Math.random()*10);
                totalResultado = totalResultado + random;
                binding.idResultadod10.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD12++;
                binding.idTiradasd12.setText(String.valueOf(cuentaD12));
                random = (int) (Math.random()*12);
                totalResultado = totalResultado + random;
                binding.idResultadod12.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD20++;
                binding.idTiradasd20.setText(String.valueOf(cuentaD20));
                random = (int) (Math.random()*20);
                totalResultado = totalResultado + random;
                binding.idResultadod20.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.idD100.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cuentaD100++;
                binding.idTiradasd100.setText(String.valueOf(cuentaD100));
                random = (int) (Math.random()*100);
                totalResultado = totalResultado + random;
                binding.idResultadod100.setText(String.valueOf(random));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });

        binding.buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentaD4 = 0;
                cuentaD6 = 0;
                cuentaD8 = 0;
                cuentaD10 = 0;
                cuentaD12 = 0;
                cuentaD20 = 0;
                cuentaD100 = 0;
                random = 0;
                totalResultado = 0;
                binding.idTiradasd4.setText(String.valueOf(cuentaD4));
                binding.idTiradasd6.setText(String.valueOf(cuentaD6));
                binding.idTiradasd8.setText(String.valueOf(cuentaD8));
                binding.idTiradasd10.setText(String.valueOf(cuentaD10));
                binding.idTiradasd12.setText(String.valueOf(cuentaD12));
                binding.idTiradasd20.setText(String.valueOf(cuentaD20));
                binding.idTiradasd100.setText(String.valueOf(cuentaD100));
                binding.idResultadod4.setText(String.valueOf("-"));
                binding.idResultadod6.setText(String.valueOf("-"));
                binding.idResultadod8.setText(String.valueOf("-"));
                binding.idResultadod10.setText(String.valueOf("-"));
                binding.idResultadod12.setText(String.valueOf("-"));
                binding.idResultadod20.setText(String.valueOf("-"));
                binding.idResultadod100.setText(String.valueOf("-"));
                binding.idTotalResultado.setText(String.valueOf(totalResultado));
            }
        });
    }
}