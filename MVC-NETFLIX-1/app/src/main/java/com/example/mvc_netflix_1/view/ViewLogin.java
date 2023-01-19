package com.example.mvc_netflix_1.view;

import android.widget.Toast;

import com.example.mvc_netflix_1.MainActivity;

public class ViewLogin {
    static MainActivity mainActivity;
    public static void mostrarLogin(String edtUser, String edtPassword){


        Toast.makeText(mainActivity.getInstance(),
                "Email y Password correctas",
                Toast.LENGTH_SHORT).show();
    }
}
