package com.example.aplicacionrutasuniversidad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DevelopDB extends SQLiteOpenHelper {
    private static final String NOMBRE_DB = "gestion.db";
    private static final int VERSION_DB = 1;
    private static final String TABLA_ESTUDIANTE = "CREATE TABLE ESTUDIANTE (ID INTEGER PRIMARY KEY, NOMBRE TEXT, EDAD INTEGER)";
    private static final String TABLA_ASIGNATURA = "CREATE TABLE ASIGNATURA (ID INTEGER PRIMARY KEY, NOMBRE TEXT, CREDITOS INTEGER)";
    private static final String TABLA_DOCENTE = "CREATE TABLE DOCENTE (ID INTEGER PRIMARY KEY, NOMBRE TEXT, FACULTAD TEXT)";
    private static final String TABLA_MATRICULA = "CREATE TABLE MATRICULA (ID INTEGER PRIMARY KEY, ESTUDIANTE_ID INTEGER, ASIGNATURA_ID INTEGER)";

    public DevelopDB(@Nullable Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_ESTUDIANTE);
        sqLiteDatabase.execSQL(TABLA_ASIGNATURA);
        sqLiteDatabase.execSQL(TABLA_DOCENTE);
        sqLiteDatabase.execSQL(TABLA_MATRICULA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_ESTUDIANTE);
        sqLiteDatabase.execSQL(TABLA_ESTUDIANTE);
    }

    public void agregarEstudiante(String ID, String NOMBRE, String EDAD){
        SQLiteDatabase db = getWritableDatabase();
        if (db != null){
            db.execSQL("INSERT INTO ESTUDIANTE VALUES ('"+ID+"','"+NOMBRE+"','"+EDAD+"')");
            db.close();
        }else{
            Toast.makeText(null,"Error en el db", Toast.LENGTH_SHORT).show();
        }
    }

    public void agregarAsignatura(String ID, String NOMBRE, String CREDITOS){
        SQLiteDatabase db = getWritableDatabase();
        if (db != null){
            db.execSQL("INSERT INTO ASIGNATURA VALUES ('"+ID+"','"+NOMBRE+"','"+CREDITOS+"')");
            db.close();
        }
    }

    public void agregarMatricula(String ID, String ESTUDIANTE_ID, String ASIGNATURA_ID){
      SQLiteDatabase db = getWritableDatabase();
      if(db != null){
          db.execSQL("INSERT INTO ASIGNATURA VALUES ('"+ID+"','"+ESTUDIANTE_ID+"','"+ASIGNATURA_ID+"')");
          db.close();
      }
    }

    public void agregarDocente(String ID, String NOMBRE, String FACULTAD){
        SQLiteDatabase db = getWritableDatabase();
        if (db != null) {
            db.execSQL("INSERT INTO DOCENTE VALUES ('"+ID+"','"+NOMBRE+"','"+FACULTAD+"')");
            db.close();
        }
    }
}
