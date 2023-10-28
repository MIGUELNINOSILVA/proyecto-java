package com.example.aplicacionrutasuniversidad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarAsignatura extends AppCompatActivity {
    EditText edtID, edtNOMBRE, edtCREDITOS;

    Button btnVolver, btnAgregarAsignatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_asignatura);
        edtID = (EditText) findViewById(R.id.id_asignatura_input);
        edtNOMBRE = (EditText) findViewById(R.id.nombre_asignatura_input);
        edtCREDITOS = (EditText) findViewById(R.id.edad_asignatura_input);

        btnVolver = (Button) findViewById(R.id.volverAsignatura);
        btnAgregarAsignatura = (Button) findViewById(R.id.agregarAsignatura);

        final DevelopDB developDB2 = new DevelopDB(getApplicationContext());

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AgregarAsignatura.this, RegistroAsignatura.class);
                startActivity(i);
            }
        });

        btnAgregarAsignatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                developDB2.agregarAsignatura(edtID.getText().toString(), edtNOMBRE.getText().toString(), edtCREDITOS.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGÓ CORRECTAMENTE",Toast.LENGTH_SHORT).show();
            }
        });

    }
}