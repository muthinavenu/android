package com.example.venu.activitylc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag","On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","On Destroy");
    }
}
