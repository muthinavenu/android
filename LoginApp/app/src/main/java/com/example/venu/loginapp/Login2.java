package com.example.venu.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login2 extends Activity {
    TextView tv;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        tv = (TextView) findViewById(R.id.tv);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button2_click();

            }

        });
        Bundle b = getIntent().getExtras();
        String s = "WELCOME " + b.getString("n");
        tv.setText(s);

    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.page_, menu);
        return true;
    }
*/
    private void button2_click() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }


}



