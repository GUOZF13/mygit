package com.example.gzfmr.mygit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gzfmr.mygit.R;
import com.example.gzfmr.mygit.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {
    private ListView lvShow;
    private ArrayList<String> conts= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        initListview();


    }

    private void initListview() {
        this.lvShow = (ListView) findViewById(R.id.lv_show);

        this.lvShow.setAdapter(new MyAdapter(this, R.layout.listview_item_layout, fetchItems()));


    }

    private List fetchItems() {

        for (int i = 0; i < 10; i++) {

            conts.add("hehe");

        }

        return conts;
    }
}
