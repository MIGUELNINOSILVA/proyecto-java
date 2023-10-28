package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

public class RegistroDocente extends AppCompatActivity {
    EditText idDocente, nombreDocente, facultadDocente;
    Button volverAsignaturaBoton, btnAgregarDocente;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_docente);
        idDocente = (EditText)findViewById(R.id.editTextText2);
        nombreDocente =(EditText)findViewById(R.id.editTextText4);
        facultadDocente =(EditText)findViewById(R.id.editTextText5);

        volverAsignaturaBoton = (Button)findViewById(R.id.volverAsignaturaButton3);
        btnAgregarDocente = (Button)findViewById(R.id.agregarDocenteButton);

        final DevelopDB developDB4 = new DevelopDB(getApplicationContext());
        volverAsignaturaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroDocente.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnAgregarDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                developDB4.agregarDocente(idDocente.getText().toString(), nombreDocente.getText().toString(), facultadDocente.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGÓ EXITOSAMENTE EL DOCENTE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}