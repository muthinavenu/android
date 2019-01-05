package com.example.venu.listimagedemo;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class Listimagedemo extends AppCompatActivity {
    ListView lv2;
    TextView tv;
    final Context context = this;

    String mobileList[] = {"Oppo", "Samsung", "Apple", "Huawei", "Sony", "HTC", "Motorola", "Lenovo", "Vivo", "Nokia", "Xiaomi"};
    //String mobileList[]={"Oppo"};
    //  int logo[]={R.drawable.oppo,R.drawable.samsung,R.drawable.apple,R.drawable.huawei,R.drawable.sony,R.drawable.htc,R.drawable.motorola,R.drawable.lenovo,R.drawable.vivo,R.drawable.nokia,R.drawable.xiaomi};
    int logo[] = {R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone, R.drawable.appleone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listimagedemo);
        lv2 = (ListView) findViewById(R.id.lv2);
        tv = (TextView) findViewById(R.id.textView);

        CustomAdapter ca = new CustomAdapter(getApplicationContext(), mobileList, logo);
        lv2.setAdapter(ca);


        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                 // Toast.makeText(getApplicationContext(), mobileList[position], Toast.LENGTH_SHORT).show();

                  Toast.makeText(getApplicationContext(),"You clicked on position :["+Integer.toString(position)+"]", Toast.LENGTH_SHORT).show();

              }
          });


    }

}