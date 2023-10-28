package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroAsignatura extends AppCompatActivity {
    Button volver;
    Button btnAgregarAsignatura;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_asignatura);
        volver = (Button)findViewById(R.id.volverAsignaturaButton);
        btnAgregarAsignatura = (Button) findViewById(R.id.agregar_nuevo_estudiante2);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroAsignatura.this, MainActivity.class);
                startActivity(i);
            }
        });
        btnAgregarAsignatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroAsignatura.this, AgregarAsignatura.class);
                startActivity(i);
            }
        });
    }
}