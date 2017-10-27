package com.example.gzfmr.mygit.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by GzfMR on 2017/10/27.
 */

public class MyAdapter extends ArrayAdapter {
    private final List conts;
    private Context mContex;
    private int mResource;

    public MyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.mContex = context;
        this.mResource = resource;
        this.conts = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.mContex);
        View view = inflater.inflate(this.mResource, null);

        return view;

    }
}
