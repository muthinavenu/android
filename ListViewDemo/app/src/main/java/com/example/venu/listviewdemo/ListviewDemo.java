package com.example.venu.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class ListviewDemo extends AppCompatActivity {
    ListView lv;
    String mobilelist[]={"Oppo","Samsung","Apple","Huawei","Sony","HTC","Motorola","Lenovo","Vivo","Nokia","Xiaomi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        lv = (ListView)findViewById(R.id.lv);
       // ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.activity_listviewtwo, R.id.textView,mobilelist);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.activity_listviewtwo, R.id.textView, mobilelist );
        lv.setAdapter(aa);
    }
}

