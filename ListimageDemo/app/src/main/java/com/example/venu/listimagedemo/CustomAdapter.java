package com.example.venu.listimagedemo;


import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String mobileList[];
    int logo[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] mobileList, int[] logo) {
        this.context = context;
        this.mobileList = mobileList;
        this.logo = logo;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return mobileList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listimagetwo, null);
        TextView mobile = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        mobile.setText(mobileList[i]);
        icon.setImageResource(logo[i]);
        return view;
    }
}