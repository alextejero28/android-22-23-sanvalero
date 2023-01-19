package services;

import android.widget.Toast;

import com.svalero.netflixlogin.MainActivity;

public class ServiceUser {

    public void validarUser(String email, String password){
        if(!email.equals("") && email.length()>0 &&
            !password.equals("") && password.length()>0){
            Toast.makeText(MainActivity.getInstance(),
                    "Email y Password son correctas ...",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
