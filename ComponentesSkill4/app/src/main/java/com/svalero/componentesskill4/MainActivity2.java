package com.svalero.componentesskill4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;



public class MainActivity2 extends AppCompatActivity {

    RadioButton r1, r2;
    ToggleButton tgbtn;
    TextView txtEti;
    Switch switchE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        r1 = (RadioButton) findViewById(R.id.Radio1);
        r2 = (RadioButton) findViewById(R.id.Radio2);

        tgbtn = (ToggleButton) findViewById(R.id.tgBtn1);
        txtEti = (TextView)findViewById(R.id.etiSeleccion);

        switchE = (Switch) findViewById(R.id.switch1);
    }

    public void onclick(View view){

        if (view.getId()==R.id.btn1){
            validar();
        }

        if (view.getId()==R.id.tgBtn1){
            if (tgbtn.isChecked()){
                txtEti.setText("Boton On");
            }else{
                txtEti.setText("Boton Off");
            }
        }

        if (view.getId()==R.id.switch1){
            if (switchE.isChecked()){
                txtEti.setText("Fue Activado");
            }else{
                txtEti.setText("Fue InActivado");
            }
        }


    }

    private void validar(){
        String cad = "Seleccionado: \n";

        if (r1.isChecked()==true){
            cad+="Opcion1";
        }
        if (r2.isChecked()){
            cad+="Opcion2";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }


}