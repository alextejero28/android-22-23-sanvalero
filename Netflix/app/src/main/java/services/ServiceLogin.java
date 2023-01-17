package services;

import android.widget.Toast;

import com.svalero.netflixlogin.MainActivity;


public class ServiceLogin {
    // crear método que sea MostrarLogin();


    public static void mostrarLogin(String edtUser, String edtPassword){


        Toast.makeText(MainActivity.getInstance(),
                "Email y Password correctas",
                Toast.LENGTH_SHORT).show();
    }
}
