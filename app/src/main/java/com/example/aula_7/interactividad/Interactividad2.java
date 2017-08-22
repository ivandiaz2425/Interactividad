package com.example.aula_7.interactividad;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Interactividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactividad2);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityUno(view);

            }
        });
    }
    public void goActivityUno(View view){
        Intent intent2 = new Intent(this, Interactividad.class);
        startActivity(intent2);




    }
}
