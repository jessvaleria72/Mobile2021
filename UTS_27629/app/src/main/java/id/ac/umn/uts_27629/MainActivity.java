package id.ac.umn.uts_27629;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnProfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btn_login);
        btnProfil = findViewById(R.id.btn_profil);
        btnProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent profilIntent = new Intent(MainActivity.this, ProfilActivity.class);
                if(profilIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(profilIntent);
                }
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                if(loginIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(loginIntent);
                }
            }
        });
    }
}