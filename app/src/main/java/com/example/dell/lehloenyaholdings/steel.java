package com.example.dell.lehloenyaholdings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class steel extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steel);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.b);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.c);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.d);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.e);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.f);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.g);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.h);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.i);
        models.add(m);

        return models;
    }
}
