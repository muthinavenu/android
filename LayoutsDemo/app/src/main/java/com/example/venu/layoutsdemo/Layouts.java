package com.example.venu.layoutsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layouts extends AppCompatActivity {
    Button linear , linearhorztl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        linear = (Button)findViewById(R.id.Linear);
        linearhorztl=(Button)findViewById(R.id.Linearhorztl);

        linearhorztl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),LinearLayoutHorztl.class);
                startActivity(in);

            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),LinearLayout.class);
                startActivity(i);

            }
        });




    }
}
