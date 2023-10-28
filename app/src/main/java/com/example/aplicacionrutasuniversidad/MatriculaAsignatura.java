package com.example.aplicacionrutasuniversidad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MatriculaAsignatura extends AppCompatActivity {
    Button btnVolver, btnMatricular;

    EditText idMatricula, idEstudiante, idAsignatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matricula_asignatura);
        idMatricula = (EditText)findViewById(R.id.editTextNumber5);
        idEstudiante  =(EditText)findViewById(R.id.editTextNumber4);
        idAsignatura = (EditText)findViewById(R.id.inputTextAsignatura);

        btnVolver = (Button) findViewById(R.id.volverAsignaturaButton2);
        btnMatricular = (Button)findViewById(R.id.matricularAsignaturaBoton);

        final DevelopDB developDB3 = new DevelopDB(getApplicationContext());

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MatriculaAsignatura.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnMatricular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                developDB3.agregarMatricula(idMatricula.getText().toString(), idEstudiante.getText().toString(), idAsignatura.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGÓ CORRECTAMENTE LA MATRICULA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}