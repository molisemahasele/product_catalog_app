package com.example.dell.lehloenyaholdings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button steel = (Button)findViewById(R.id.button1);
        steel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), steel.class);
                startActivity(startIntent);
            }
        });

        final Button decor = (Button)findViewById(R.id.button2);
        decor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), decor.class);
                startActivity(startIntent);
            }
        });

        final Button transport = (Button)findViewById(R.id.button3);
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), transport.class);
                startActivity(startIntent);
            }
        });
    }
}
