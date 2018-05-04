package com.kk.itemdecorationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("ItemDecorationDemo" + i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new CustomItemDecoration());
        recyclerView.setAdapter(new Adapter(this, list));
    }
}
