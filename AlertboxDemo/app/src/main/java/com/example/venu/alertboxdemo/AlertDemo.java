package com.example.venu.alertboxdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class AlertDemo extends AppCompatActivity {
    final Context context = this;
    Button ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_demo);
        ab=(Button)findViewById(R.id.alertbox);
        ab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(context);
                alertDialogbuilder.setTitle("Alert Box");
                alertDialogbuilder
                        .setMessage("Click Yes to Exit")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    public void onClick (DialogInterface dialog ,int id){
                        AlertDemo.this.finish();
                    }
                })
                    .setNegativeButton("No",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                             dialog.cancel();
                }
            });

            AlertDialog alertDialog = alertDialogbuilder.create();
                alertDialog.show();
            }
        });
    }
}


