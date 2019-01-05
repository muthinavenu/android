package com.example.venu.gridviewdemo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;

public class GridDemo extends AppCompatActivity {
    final Context context = this;
    GridView simpleGridview;
    int app[]={R.drawable.chrome,R.drawable.fb,R.drawable.gmail,R.drawable.hangouts,R.drawable.insta,R.drawable.photos,
            R.drawable.twitter,R.drawable.wu,R.drawable.you,R.drawable.gallery};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_demo);
        simpleGridview = (GridView)findViewById(R.id.simpleGridview);
        CustomAdapter customadapter = new CustomAdapter(getApplicationContext(),app);
        simpleGridview.setAdapter(customadapter);
        simpleGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int index = position;
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Alert");
                alertDialogBuilder.setMessage("Do You want to view Image")
                           .setCancelable(true)
                           .setPositiveButton("NO", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int id) {
                                   dialog.cancel();
                               }
                           })
                            .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {

                                    Intent i = new Intent(GridDemo.this,SecondActivity.class);
                                   i.putExtra("image",app[index]);
                                    startActivity(i);
                                }
                            });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}
