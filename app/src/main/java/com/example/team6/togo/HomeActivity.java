package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * HomeActivity takes you to the menu when a button is clicked.
 *
 * @author Justin Reel, Andrew Shore, Zachary Newell
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    /**
     * start the menu activity
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     * @param view
     */
    public void toMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
