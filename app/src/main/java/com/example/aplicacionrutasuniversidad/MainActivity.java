package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton registroEstudianteBoton;
    RadioButton registroAsignaturaBoton;
    RadioButton matriculaAsignaturaBoton;
    RadioButton registroDocentesBoton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registroEstudianteBoton = (RadioButton)findViewById(R.id.registroEstudianteButton);
        registroAsignaturaBoton = (RadioButton)findViewById(R.id.registroAsignaturaButton);
        matriculaAsignaturaBoton = (RadioButton)findViewById(R.id.matriculaAsignaturaButton);
        registroDocentesBoton = (RadioButton)findViewById(R.id.registroDocentesButton);

        registroEstudianteBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RegistroEstudiante.class);
                startActivity(i);
            }
        });
        registroAsignaturaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RegistroAsignatura.class);
                startActivity(i);
            }
        });
        matriculaAsignaturaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MatriculaAsignatura.class);
                startActivity(i);
            }
        });
        registroDocentesBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RegistroDocente.class);
                startActivity(i);
            }
        });
    }
}