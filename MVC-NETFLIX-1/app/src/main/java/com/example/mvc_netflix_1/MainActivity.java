package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.view.ViewLogin;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private static MainActivity view;
    private ViewLogin viewLogin;
    private StudentWS model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CARGAR VIEW
        view = this;
        // CARGAR MODEL
        model = new StudentWS();
        // MODEL + VIEW
        controller = new StudentController(model, view);
        // CASO DE USO -> OBTENER ESTUDIANTE
            controller.getStudent();

    }

    public void printStudentDetails(Student student){
        /*Log.d("MainActivity - NAME", student.getName());
        Log.d("MainActivity - SURNAME", student.getSurname());
        */

    }

    private void initComponents() {
        EditText edtUser = findViewById(R.id.edtUser);
        EditText edtPassword = findViewById(R.id.edtPassword);
        Button enviarbtn = findViewById(R.id.enviarbtn);
        enviarbtn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                String email = edtUser.getText().toString();
                String password = edtPassword.getText().toString();
                if (!email.equals("") && email.length() > 0 &&
                        !password.equals("") && password.length() > 0) {
                    viewLogin.mostrarLogin(email, password);
                }
                model.getStudentWS().setName(edtUser.toString());
            }
        });
    }

    public static MainActivity getInstance(){
        if (view.getInstance() == null){
            view = new MainActivity();
        }
        return view;
    }
}