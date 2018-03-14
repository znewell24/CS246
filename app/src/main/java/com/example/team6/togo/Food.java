package com.example.team6.togo;

import android.content.Intent;

/**
 * Created by znewe_000 on 3/14/2018.
 */

public class Food {
    private String name;
    private String price;
    private int quantity;

    public Food (String n, String p, int q) {
        name = n;
        price = p;
        quantity = q;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
