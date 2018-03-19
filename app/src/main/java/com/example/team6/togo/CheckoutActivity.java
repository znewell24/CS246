package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Intent intent = getIntent();

        createReciept();
    }

    public void createReciept () {
        List<Food> l = ((Cart) this.getApplication()).getCartList();

        final LinearLayout li = (LinearLayout)findViewById(R.id.ll);
        for (Food f: l) {
            final TextView n = new TextView(this);
            n.setText(f.getName());
            li.addView(n);


            TextView p = new TextView(this);
            p.setText(f.getPrice());
            li.addView(p);

            TextView q = new TextView(this);
            q.setText(f.getQuantity());
            li.addView(q);
        }


    }
}
