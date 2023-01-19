package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private static MainActivity view;
    private StudentWS model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CARGAR VIEW
        view = this;
        // CARGAR MODEL

        // MODEL + VIEW
        controller = new StudentController(model, view);
        // CASO DE USO -> OBTENER ESTUDIANTE
            controller.getStudent();

    }

    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME", student.getName());
        Log.d("MainActivity - SURNAME", student.getSurname());
    }

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

    public static MainActivity getInstance(){
        if (view.getInstance() == null){
            view = new MainActivity();
        }
        return view;
    }
}