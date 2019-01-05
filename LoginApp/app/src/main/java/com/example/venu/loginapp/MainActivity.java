package com.example.venu.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    EditText un, pwd;
    Button button;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un = (EditText) findViewById(R.id.un);
        pwd = (EditText) findViewById(R.id.pwd);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button_click();
            }
        });



    }

    private void button_click() {
        if (un.getText().toString().equals("admin")
                && pwd.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
            String a = un.getText().toString();
            Intent i = new Intent(this, Login2.class);
            i.putExtra("n", a);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Pasword", Toast.LENGTH_LONG).show();

        }
    }

}