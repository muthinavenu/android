package com.example.venu.listviewcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListviewCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_code);
        LinearLayout linear = new LinearLayout(this);
        ListView list = new ListView(this);

         final  String mobileList[]={"Oppo","Samsung","Apple","Huawei","Sony","HTC","Motorola","Lenovo","Vivo","Nokia","Xiaomi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (ListviewCode.this, android.R.layout.simple_list_item_1,  mobileList );
        list.setAdapter(adapter);
        linear.addView(list);
        //linear.addView(textview);

        this.setContentView(linear, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListviewCode.this, mobileList[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
