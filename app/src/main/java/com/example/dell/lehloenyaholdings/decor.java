package com.example.dell.lehloenyaholdings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class decor extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decor);

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
        m.setImg(R.drawable.a3);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a4);
        models.add(m);


        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a5);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a6);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a7);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a8);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a9);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a10);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a11);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a12);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a13);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a14);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a15);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a16);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a17);
        models.add(m);

        m = new Model();
        //m.setTitle("A dust bin");
        //m.setDescription("300g   M18.00");
        m.setImg(R.drawable.a18);
        models.add(m);

        return models;
    }
}
