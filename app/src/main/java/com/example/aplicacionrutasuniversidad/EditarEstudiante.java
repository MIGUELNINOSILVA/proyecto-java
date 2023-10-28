package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditarEstudiante extends AppCompatActivity {

    Button volverBoton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_estudiante);
        volverBoton = (Button)findViewById(R.id.volverButton2);

        volverBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EditarEstudiante.this, RegistroEstudiante.class);
                startActivity(i);
            }
        });
    }
}