package com.svalero.cinemaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.cinemaandroid.entities.Usuario;
import com.svalero.cinemaandroid.utils.ApiClient;
import com.svalero.cinemaandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Obtener referencias a los componentes de la interfaz de usuario
        email = (EditText)findViewById(R.id.btnCorreo);
        password = (EditText)findViewById(R.id.btnPass);
        login = (Button)findViewById(R.id.btnIniciar);

        // Manejar el evento de clic del botón de inicio de sesión
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = email.getText().toString().trim();
                String contrasena = password.getText().toString().trim();

                // Validar las credenciales del usuario
                if (validateCredentials(correo, contrasena)) {
                    // Iniciar la actividad principal
                    Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                    startActivity(intent);
                } else {
                    // Mostrar un mensaje de error si las credenciales no son válidas
                    Toast.makeText(getBaseContext(), "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
    });
    }

    // Método para validar las credenciales del usuario
    private boolean validateCredentials(String correo, String contrasena) {
        final boolean[] isValid = new boolean[1];
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Usuario>> call = apiService.login(correo, contrasena);
        call.enqueue(new Callback<ArrayList<Usuario>>() {
            @Override
            public void onResponse(Call<ArrayList<Usuario>> call, Response<ArrayList<Usuario>> response) {
                ArrayList<Usuario> lstFiltrosPeliculasRespuesta = response.body();

                isValid[0] = !lstFiltrosPeliculasRespuesta.isEmpty();
            }

            @Override
            public void onFailure(Call<ArrayList<Usuario>> call, Throwable t) {
                isValid[0] = false;
            }
        });
        return isValid[0];
    }
}
