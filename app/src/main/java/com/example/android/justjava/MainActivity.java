/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean whippedCreamCheckBox.isChecked();

        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);

    }

    /**
     * Calculates the price of the order.
     * // @param pricePerCup
     * // @param quantity
     * @return total price
   * */
    private int calculatePrice() {
        return quantity * 5;
    }
    /**
     * Create summary o
     *@param price of the order
     * @return text summary
     * */
    private String createOrderSummary(int price){
        String priceMessage = "Well done ;)";
        priceMessage += "\nHave a great day!;
        priceMessage +=  "\nWoohoo!";
        return priceMessage;
    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void submitIncrement(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void submitDecrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView ordersummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        ordersummaryTextView.setText(message);
    }


}