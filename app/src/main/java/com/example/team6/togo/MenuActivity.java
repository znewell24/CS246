package com.example.team6.togo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Switch;
import android.widget.TextView;

import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * beefy activity, will determine which cardview was clicked in order to
 * display correct information on the DisplayItemActivity.java
 *
 * @author Justin Reel, Andrew Shore, Zachary Newell
 */
public class MenuActivity extends AppCompatActivity {
    public static final String NAME = "com.example.team6.togo.sname";
    public static final String DES = "com.example.team6.togo.sdescription";
    public static final String PRICE = "com.example.team6.togo.sprice";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }


    /**
     * holds the switch case which directs the app what information to send where
     *
     * @author Justin Reel, Andrew Shore, Zachary Newell
     * @param view
     */
    public void onClick(View view){
        Intent intent = new Intent(this, DisplayItemActivity.class);
        TextView name;
        TextView description;
        TextView price;

        String sName;
        String sDescription;
        String sPrice;


        switch(view.getId()){
            //Appetizers
            case R.id.toweringOnionRingsCard:
                name = (TextView) findViewById(R.id.toweringOnionRingsName);
                description = (TextView) findViewById(R.id.toweringOnionRingsDescription);
                price = (TextView) findViewById(R.id.toweringOnionRingsPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.friedMacAndCheeseCard:
                name = (TextView) findViewById(R.id.friedMacAndCheeseName);
                description = (TextView) findViewById(R.id.friedMacAndCheeseDescription);
                price = (TextView) findViewById(R.id.friedMacAndCheesePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.friedSqueakyCheeseCurdsCard:
                name = (TextView) findViewById(R.id.friedSqueakyCheeseCurdsName);
                description = (TextView) findViewById(R.id.friedSqueakyCheeseCurdsDescription);
                price = (TextView) findViewById(R.id.friedSqueakyCheeseCurdsPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.friedNickelPicklesCard:
                name = (TextView) findViewById(R.id.friedNickelPicklesName);
                description = (TextView) findViewById(R.id.friedNickelPicklesDescription);
                price = (TextView) findViewById(R.id.friedNickelPicklesPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Sandwiches
            case R.id.pulledPorkCard:
                name = (TextView) findViewById(R.id.pulledPorkName);
                description = (TextView) findViewById(R.id.pulledPorkDescription);
                price = (TextView) findViewById(R.id.pulledPorkPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.brisketStackerCard:
                name = (TextView) findViewById(R.id.brisketStackerName);
                description = (TextView) findViewById(R.id.brisketStackerDescription);
                price = (TextView) findViewById(R.id.brisketStackerPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.sirloinSteakFajitaWrapCard:
                name = (TextView) findViewById(R.id.sirloinSteakFajitaWrapName);
                description = (TextView) findViewById(R.id.sirloinSteakFajitaWrapDescription);
                price = (TextView) findViewById(R.id.sirloinSteakFajitaWrapPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.theTBACard:
                name = (TextView) findViewById(R.id.theTBAName);
                description = (TextView) findViewById(R.id.theTBADescription);
                price = (TextView) findViewById(R.id.theTBAPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Burgers
            case R.id.quarterPounderCard:
                name = (TextView) findViewById(R.id.quarterPounderName);
                description = (TextView) findViewById(R.id.quarterPounderDescription);
                price = (TextView) findViewById(R.id.quarterPounderPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.halfPounderCard:
                name = (TextView) findViewById(R.id.halfPounderName);
                description = (TextView) findViewById(R.id.halfPounderDescription);
                price = (TextView) findViewById(R.id.halfPounderPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.bbqBaconCard:
                name = (TextView) findViewById(R.id.bbqBaconName);
                description = (TextView) findViewById(R.id.bbqBaconDescription);
                price = (TextView) findViewById(R.id.bbqBaconPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.honeyBadgerCard:
                name = (TextView) findViewById(R.id.honeyBadgerName);
                description = (TextView) findViewById(R.id.honeyBadgerDescription);
                price = (TextView) findViewById(R.id.honeyBadgerPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.briskeyBuisnessCard:
                name = (TextView) findViewById(R.id.briskyBuisnessName);
                description = (TextView) findViewById(R.id.briskyBuisnessDescription);
                price = (TextView) findViewById(R.id.briskyBuisnessPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.bigSCard:
                name = (TextView) findViewById(R.id.bigSName);
                description = (TextView) findViewById(R.id.bigSDescription);
                price = (TextView) findViewById(R.id.bigSPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Salads
            case R.id.cobbCard:
                name = (TextView) findViewById(R.id.cobbName);
                description = (TextView) findViewById(R.id.cobbDescription);
                price = (TextView) findViewById(R.id.cobbPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.sweetPulledPorkCard:
                name = (TextView) findViewById(R.id.sweetPulledPorkName);
                description = (TextView) findViewById(R.id.sweetPulledPorkDescription);
                price = (TextView) findViewById(R.id.sweetPulledPorkPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Dinners
            case R.id.flatIronRibeyeSteakCard:
                name = (TextView) findViewById(R.id.flatIronRibeyeSteakName);
                description = (TextView) findViewById(R.id.flatIronRibeyeSteakDescription);
                price = (TextView) findViewById(R.id.flatIronRibeyeSteakPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.hickorySmokedPrimeRibCard:
                name = (TextView) findViewById(R.id.hickorySmokedPrimeRibName);
                description = (TextView) findViewById(R.id.hickorySmokedPrimeRibDescription);
                price = (TextView) findViewById(R.id.hickorySmokedPrimeRibPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.brisketCard:
                name = (TextView) findViewById(R.id.brisketName);
                description = (TextView) findViewById(R.id.brisketDescription);
                price = (TextView) findViewById(R.id.brisketPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.chickenFriedSteakCard:
                name = (TextView) findViewById(R.id.chickenFriedSteakName);
                description = (TextView) findViewById(R.id.chickenFriedSteakDescription);
                price = (TextView) findViewById(R.id.chickenFriedSteakPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.grandmaRosiesMacAndCheeseCard:
                name = (TextView) findViewById(R.id.grandmaRosiesMacAndCheeseName);
                description = (TextView) findViewById(R.id.grandmaRosiesMacAndCheeseDescription);
                price = (TextView) findViewById(R.id.grandmaRosiesMacAndCheesePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.smokedTurkeyDinnerCard:
                name = (TextView) findViewById(R.id.smokedTurkeyDinnerName);
                description = (TextView) findViewById(R.id.smokedTurkeyDinnerDescription);
                price = (TextView) findViewById(R.id.smokedTurkeyDinnerPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Desserts
            case R.id.everestBrownieSundaeCard:
                name = (TextView) findViewById(R.id.everestBrownieSundaeName);
                description = (TextView) findViewById(R.id.everestBrownieSundaeDescription);
                price = (TextView) findViewById(R.id.everestBrownieSundaePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.rockyMountainMudPieCard:
                name = (TextView) findViewById(R.id.rockyMountainMudPieName);
                description = (TextView) findViewById(R.id.rockyMountainMudPieDescription);
                price = (TextView) findViewById(R.id.rockyMountainMudPiePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.mudLakeCakeCard:
                name = (TextView) findViewById(R.id.mudLakeCakeName);
                description = (TextView) findViewById(R.id.mudLakeCakeDescription);
                price = (TextView) findViewById(R.id.mudLakeCakePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.mountainHuckleberryCheesecakeCard:
                name = (TextView) findViewById(R.id.mountainHuckleberryCheesecakeName);
                description = (TextView) findViewById(R.id.mountainHuckleberryCheesecakeDescription);
                price = (TextView) findViewById(R.id.mountainHuckleberryCheesecakePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Drinks
            case R.id.pepsiCard:
                name = (TextView) findViewById(R.id.pepsiName);
                description = (TextView) findViewById(R.id.pepsiDescription);
                price = (TextView) findViewById(R.id.pepsiPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.dietPepsiCard:
                name = (TextView) findViewById(R.id.dietPepsiName);
                description = (TextView) findViewById(R.id.dietPepsiDescription);
                price = (TextView) findViewById(R.id.dietPepsiPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.mountainDewCard:
                name = (TextView) findViewById(R.id.mountainDewName);
                description = (TextView) findViewById(R.id.mountainDewDescription);
                price = (TextView) findViewById(R.id.mountainDewPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.dietMountainDewCard:
                name = (TextView) findViewById(R.id.dietMountainDewName);
                description = (TextView) findViewById(R.id.dietMountainDewDescription);
                price = (TextView) findViewById(R.id.dietMountainDewPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.rootbeerCard:
                name = (TextView) findViewById(R.id.rootbeerName);
                description = (TextView) findViewById(R.id.rootbeerDescription);
                price = (TextView) findViewById(R.id.rootbeerPrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;
            case R.id.lemonadeCard:
                name = (TextView) findViewById(R.id.lemonadeName);
                description = (TextView) findViewById(R.id.lemonadeDescription);
                price = (TextView) findViewById(R.id.lemonadePrice);

                sName = name.getText().toString();
                sDescription = description.getText().toString();
                sPrice = price.getText().toString();
                break;

            //Default
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

    //to the checkoutactivity
    public void toCheckout(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

    public void toToast(View view) {
        Toast.makeText(this, "I clicked", Toast.LENGTH_SHORT).show();
    }
}
