package com.example.aula_7.interactividad;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interactividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactividad);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityDos(view);

            }
        });

        Button btn_1=(Button) findViewById(R.id.btn_1);
        registerForContextMenu(btn_1);



    }

    public void goActivityDos(View view){
        Intent intent = new Intent(this, Interactividad2.class);
        startActivity(intent);
    }

}
