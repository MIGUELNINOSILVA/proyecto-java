package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarEstudiante extends AppCompatActivity {
    EditText edtID, edtNOMBRE, edtEDAD;
    Button btnAgregar;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_estudiante);

        edtID=(EditText) findViewById(R.id.id_asignatura_input);
        edtNOMBRE=(EditText) findViewById(R.id.nombre_asignatura_input);
        edtEDAD=(EditText) findViewById(R.id.edad_asignatura_input);
        btnAgregar=(Button) findViewById(R.id.agregar_boton_asignatura);
        btnVolver=(Button) findViewById(R.id.volver_boton_estudiante);

        final DevelopDB developDB = new DevelopDB(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                developDB.agregarEstudiante(edtID.getText().toString(), edtNOMBRE.getText().toString(), edtEDAD.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGÓ CORRECTAMENTE",Toast.LENGTH_SHORT).show();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AgregarEstudiante.this, RegistroEstudiante.class);
                startActivity(i);
            }
        });

    }
}