package com.example.ebayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;
    private Button iniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        iniciar = (Button)findViewById(R.id.bt);

        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String user = usuario.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("Android") && pass.equals("123"))
                {
                    Intent i = new Intent(MainActivity.this, Menu_act.class);
                    startActivity(i);
                }
                else
                {

                }

            }
        });

    }
}