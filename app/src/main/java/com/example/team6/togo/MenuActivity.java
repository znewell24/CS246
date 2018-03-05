package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {
    public static final String NAME = "com.example.team6.togo.name";
    public static final String DES = "com.example.team6.togo.name";
    public static final String PRICE = "com.example.team6.togo.name";

//    Toolbar toolbar;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        Intent intent = getIntent();
    }


    public void onClick(View view){
        Intent intent = new Intent(this, DisplayItemActivity.class);

        TextView name;
        TextView description;
        TextView price;
        String sName;
        String sDescription;
        String sPrice;


        switch(view.getId()) {
            case R.id.bbqBaconCard:
                name = findViewById(R.id.bbqBaconName);
                description = findViewById(R.id.bbqBaconDescription);
                price = findViewById(R.id.bbqBaconPrice);
                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            default:
                sName = "nothing";
                sDescription = "nothing";
                sPrice = "nothing";
                break;
        }

        intent.putExtra(NAME, sName);
        intent.putExtra(DES, sDescription);
        intent.putExtra(PRICE, sPrice);
        startActivity(intent);
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }

    public void toCheckout(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

    public void toToast(View view) {
        Toast.makeText(this, "I clicked", Toast.LENGTH_SHORT).show();
    }
}
