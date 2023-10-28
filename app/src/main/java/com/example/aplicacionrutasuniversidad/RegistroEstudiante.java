package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroEstudiante extends AppCompatActivity {
    Button volverBoton;
    Button consultarBoton;
    Button editarEstudianteBoton;
    Button btnAgregarEstudiante;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_estudiante);
        volverBoton = (Button)findViewById(R.id.volverButton);
        consultarBoton = (Button)findViewById(R.id.consultarButton);
        editarEstudianteBoton = (Button)findViewById(R.id.editarEstudianteButton);
        btnAgregarEstudiante = (Button)findViewById(R.id.agregar_nuevo_estudiante);

        volverBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroEstudiante.this, MainActivity.class);
                startActivity(i);
            }
        });
        consultarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroEstudiante.this, ConsultarEstudiante.class);
                startActivity(i);
            }
        });
        editarEstudianteBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroEstudiante.this, EditarEstudiante.class);
                startActivity(i);
            }
        });
        btnAgregarEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroEstudiante.this, AgregarEstudiante.class);
                startActivity(i);
            }
        });
    }
}