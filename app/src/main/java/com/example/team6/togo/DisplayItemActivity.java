package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * takes the information from menuactivity and displays it nicely
 * with an option to add quantity and add to cart buttons
 *
 * @author Justin Reel, Andrew Shore, Zachary Newell
 */
public class DisplayItemActivity extends AppCompatActivity {

    //private data
    private TextView tName;
    private TextView tDescription;
    private TextView tPrice;
    private int totalq = 1;

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

    /**
     * uses the buttons to add or subtract the quantity
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     * @param view
     */
    public void changeQuantity(View view) {
        TextView qview = (TextView) findViewById(R.id.quantity);

        switch (view.getId()) {
            case R.id.addq:
                if(totalq < 10) {
                    totalq = totalq + 1;
                }
                break;
            case R.id.subbq:
                if(totalq > 1) {
                    totalq = totalq - 1;
                }
                break;
        }
        qview.setText(Integer.toString(totalq));
    }

    /**
     * create the food object and add it to the global list.
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     * @param view
     */
    public void added(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);

        //print to the screen and create the food object
        String n = tName.getText().toString();
        String p = tPrice.getText().toString();
        TextView quantity = findViewById(R.id.quantity);
        int q = Integer.parseInt(quantity.getText().toString());
        Food f = new Food(n, p, q);

        double dPrice = Double.parseDouble(p);
        for (int i = 0 ; i < q; i++) {
            ((Cart) this.getApplication()).setTotal(dPrice);
        }

        //add to the list
        ((Cart) this.getApplication()).setCartList(f);
        Toast.makeText(this, "Item Added to Cart", Toast.LENGTH_SHORT).show();
    }
}
