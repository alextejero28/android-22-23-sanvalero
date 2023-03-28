package com.svalero.cinemaandroid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MailActivity extends AppCompatActivity {

    protected void sendEmail() {
        Log.e("Test email:", "enviando email");
        String[] TO = {"a26009@svalero.com"};
        String[] CC = {"a26009@svalero.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "COMPRA ENTRADAS");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "¡Felicidades! Tu compra ha sido confirmada");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.e("Test email:", "Fin envio email");

        } catch (ActivityNotFoundException ex) {
            Toast.makeText(getBaseContext(), "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
};


