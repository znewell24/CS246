package com.example.team6.togo;

import android.content.Intent;

/**
 * Holds the specific food item to be loaded into the list later
 * holds a name, price, and quantity of the item for pricing purposes.
 *
 * @author znewe_000
 * @since 3/14/2018.
 */
//this is the class to be loaded into the shopping cart's list
public class Food {
    //we need a name, price and quantity
    private String name;
    private String price;
    private int quantity;

    //constructor, this is the only way this object should be created.
    public Food (String n, String p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    //getters and setters for all of our data
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
    public String getQuantity() { return Integer.toString(quantity); }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    //override the tostring method to correctly print the food item.
    @Override
    public String toString() {
        return this.getName() + "\n" + "Quantity: " + this.getQuantity() + "   Price: $" + this.getPrice() + "\n"
                + "-------------------------------------------\n";
    }
}
