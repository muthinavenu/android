package com.example.venu.androidcompnts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_intent);
        Toast.makeText(this, "We are moved to second Activity",Toast.LENGTH_LONG).show();
    }
}
