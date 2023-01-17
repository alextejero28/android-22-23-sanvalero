package com.svalero.netflixlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import services.ServiceLogin;

public class MainActivity extends AppCompatActivity {
    private static MainActivity parent;
    public static MainActivity getInstance() {
        return parent;
    }
    @Override
    //ON LOAD EN JAVASCRIPT
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        this.parent = this;
    }

    private EditText edtUser;
    private EditText edtPassword;
    private Button btnLogin;

    private void initComponents() {
        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtUser.getText().toString();
                String password = edtPassword.getText().toString();
                if (!email.equals("") && email.length() > 0 &&
                        !password.equals("") && password.length() > 0) {


                    ServiceLogin.mostrarLogin(email, password);
                }
            }
        });
    }



}

