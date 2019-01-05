package com.example.venu.includetagdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class IncludeTag extends AppCompatActivity {

    Button customButton;
    ImageView customImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include_tag);
        customButton = (Button) findViewById(R.id.customButton);
        customImageView =(ImageView)findViewById(R.id.customImageView);

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Custom Layout’s Button Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
