package com.nqsoftwaresolutions.updateimagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView prince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){
        prince = findViewById(R.id.prince1Img);
        prince.setImageResource(R.drawable.prince2);
    }
}