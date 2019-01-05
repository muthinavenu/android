package com.example.venu.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int app[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationconteContext,int app[]){
        this.context = applicationconteContext;
        this.app =app;
        inflater = (LayoutInflater.from(applicationconteContext));

    }
    @Override
    public int getCount(){
        return app.length;
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
        view = inflater.inflate(R.layout.gridview, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(app[i]);
        return view;
    }
}
