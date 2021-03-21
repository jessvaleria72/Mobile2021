package id.ac.umn.uts_27629;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().equals("uasmobile") &&
                etPassword.getText().toString().equals("uasmobilegenap")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            LoginActivity.this
                    );
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Selamat Datang !");
                    builder.setMessage("Jessica Valeria - 00000027629");
                    builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            Intent songIntent = new Intent(LoginActivity.this, SongActivity.class);
                            if(songIntent.resolveActivity(getPackageManager()) != null){
                                startActivity(songIntent);
                            }
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password !",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}