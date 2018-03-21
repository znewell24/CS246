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
    private double total = 0.00;
    private double tax = 0.06;

    //cartList getter and setter  *added a remove 3/14
    public List<Food> getCartList() {
        return this.cartList;
    }
    public void setCartList(Food f) {
        cartList.add(f);
    }
    public void removeItem(Food f) { cartList.remove(f); }

    //total getter and setter  *added a subtract 3/14
    public double getTotal(){
        return this.total;
    }
    public double getTax() { return (this.total * this.tax); }
    public void setTotal(double price){ total += price; }
    public void subractTotal(double price){ total -= price; }
}
