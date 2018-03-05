package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class DisplayItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_item);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MenuActivity.NAME);
        String description = intent.getStringExtra(MenuActivity.DES);
        String price = intent.getStringExtra(MenuActivity.PRICE);

        TextView tName = findViewById(R.id.name);
        TextView tDescription = findViewById(R.id.description);
        TextView tPrice = findViewById(R.id.price);

        tName.setText(name);
        tDescription.setText(description);
        tPrice.setText(price);

    }
}
