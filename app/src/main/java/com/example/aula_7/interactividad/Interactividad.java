package com.example.aula_7.interactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Interactividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactividad);
    }

    public void goActivityDos(View view){
        Intent intent = new Intent(this, Interactividad2.class);
        startActivity(intent);




    }

}
