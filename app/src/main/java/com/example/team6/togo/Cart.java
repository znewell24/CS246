package com.example.team6.togo;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by znewe_000 on 3/12/2018.
 */

public class Cart extends Application{

    //global variable to access in the different activities
    private List<Food> cartList = new ArrayList<>();
    private double total = 0.0;

    //cartList getter and setter
    public List<Food> getCartList() {
        return this.cartList;
    }
    public void setCartList(Food f) {
        cartList.add(f);
    }

    //total getter and setter
    public double getTotal(){
        return this.total;
    }
    public void setTotal(double price){ total += price; }
}
