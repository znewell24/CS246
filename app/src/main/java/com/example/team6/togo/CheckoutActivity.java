package com.example.team6.togo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.List;

/**
 * display all the food objects in the cart, prints the price and tax
 * of the whole order and allows the user to submit the order.
 *
 * @author Justin Reel, Andrew Shore, Zachary Newell
 */
public class CheckoutActivity extends AppCompatActivity {

//    private DecimalFormat d = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent intent = getIntent();

        createReciept();
        printTotals();
    }

    /**
     * Creates a dynamic layout to print the cart list found in Cart.java
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     */
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
            q.setText("Quantity: " + f.getQuantity() + "\n");
            li.addView(q);
        }
    }

    /**
     * print the correct subtotal, tax, and total
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     */
    public void printTotals(){
        TextView subTotal = (TextView) findViewById(R.id.subTotal);
        TextView tax = (TextView) findViewById(R.id.tax);
        TextView total = (TextView) findViewById(R.id.total);
        DecimalFormat d = new DecimalFormat("#.##");

        subTotal.setText("$" + d.format(((Cart) this.getApplication()).getTotal()));
        tax.setText("$" + d.format(((Cart) this.getApplication()).getTax() + 0.00));
        total.setText("$" + d.format((((Cart) this.getApplication()).getTax()) + ((Cart) this.getApplication()).getTotal()));
    }

    /**
     * clicking the button opens your order receipt in an email, which
     * will open a new app. Also clears the cart list and resets the textviews
     * to 0.
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     * @param view
     */
    public void placeOrder(View view) {
        String[] TO = {"example@gmail.com"};
        List<Food> l = ((Cart) this.getApplication()).getCartList();
//        String body = "";
        DecimalFormat d = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        //Convert list to string
        for (Food f : l) {
            f.toString();
            sb.append(f);
        }
        sb.append("\n SubTotal: $" + d.format(((Cart) this.getApplication()).getTotal()) + "\n");
        sb.append("Tax:          $" + d.format(((Cart) this.getApplication()).getTax()) + "\n");
        sb.append("Total:       $" + d.format((((Cart) this.getApplication()).getTax()) + ((Cart) this.getApplication()).getTotal()));
        String body = sb.toString();

       // emailIntent.setData(Uri.parse("mailto:"))
        emailIntent.setType("application/octet-stream");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hickory Confirmation");
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);

        try{
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There is no email for ", Toast.LENGTH_SHORT).show();
        }

        //clear the cart
        ((Cart) this.getApplication()).clearCart();
        TextView subTotal = (TextView) findViewById(R.id.subTotal);
        TextView tax = (TextView) findViewById(R.id.tax);
        TextView total = (TextView) findViewById(R.id.total);

        //reset the textviews to 0
        subTotal.setText("0");
        tax.setText("0");
        total.setText("0");
    }
}
