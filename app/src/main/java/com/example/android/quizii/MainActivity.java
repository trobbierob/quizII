package com.example.android.quizii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Uchiha text
        ImageView uchiha = (ImageView)findViewById(R.id.madara);
        uchiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uchihaIntent = new Intent(MainActivity.this, UchihaActivity.class);
                startActivity(uchihaIntent);
            }
        });

        // Find the View that shows the Senju text
        ImageView senju = (ImageView)findViewById(R.id.hashirama);
        senju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent senjuIntent = new Intent(MainActivity.this, SenjuActivity.class);
                startActivity(senjuIntent);
            }
        });
    }
}