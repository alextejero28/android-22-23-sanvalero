package com.svalero.componentesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1= (Button) findViewById(R.id.btnClaseAnonima);
        btn2= (Button) findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);

        //Clase Anonima
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la anónima", Toast.LENGTH_LONG).show();
            }
        });
    }

    //Desde implements o método
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnOnClick:
                Toast.makeText(getApplicationContext(), "Desde el onclick del método", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnImplements:
                Toast.makeText(getApplicationContext(), "Desde el onclick implements", Toast.LENGTH_LONG).show();
                break;
        }
    }


}
