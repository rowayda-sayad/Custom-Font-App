package com.example.customfontudemy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textC = findViewById(R.id.textC);
        textC.setTypeface(ResourcesCompat.getFont(this, R.font.palette_mosaic_regular));

    }
}