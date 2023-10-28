package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsultarEstudiante extends AppCompatActivity {

    Button volverBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_estudiante);
        volverBoton = (Button)findViewById(R.id.volverButton3);

        volverBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConsultarEstudiante.this, RegistroEstudiante.class);
                startActivity(i);
            }
        });

    }
}