package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class DisplayItemActivity extends AppCompatActivity {

    private TextView tName;
    private TextView tDescription;
    private TextView tPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_item);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MenuActivity.NAME);
        String description = intent.getStringExtra(MenuActivity.DES);
        String price = intent.getStringExtra(MenuActivity.PRICE);

        tName = findViewById(R.id.name);
        tDescription = findViewById(R.id.description);
        tPrice = findViewById(R.id.price);

        tName.setText(name);
        tDescription.setText(description);
        tPrice.setText(price);

    }

    public void added(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);

        String n = tName.getText().toString();
        String p = tPrice.getText().toString();
        TextView quantity = findViewById(R.id.quantity);
        int q = Integer.parseInt(quantity.getText().toString());
        Food f = new Food(n, p, q);

        double dPrice = Double.parseDouble(p);
        for (int i = 0 ; i < q; i++) {
            ((Cart) this.getApplication()).setTotal(dPrice);
        }

        ((Cart) this.getApplication()).setCartList(f);
        Toast.makeText(this, "Item Added to Cart", Toast.LENGTH_SHORT).show();
    }
}
