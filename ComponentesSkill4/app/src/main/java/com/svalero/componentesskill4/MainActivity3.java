package com.svalero.componentesskill4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    private static final String TAG="Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "Valor Informacion");
        Log.d("Debug", "Valor Debug");
        Log.w("Warning", "Valor Warning");
        Log.e("Error", "Valor Error");
        Log.v("verbose", "Valor Verbose");

        Log.i(TAG, "Mensaje de seguimiento 1");
        Log.i(TAG, "Mensaje de seguimiento 2");
        Log.i(TAG, "Mensaje de seguimiento 3");
        Log.i(TAG, "Mensaje de seguimiento 4");
        Log.i(TAG, "Mensaje de seguimiento 5");

    }

}