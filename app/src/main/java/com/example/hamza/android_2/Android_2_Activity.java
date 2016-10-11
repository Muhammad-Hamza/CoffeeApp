package com.example.hamza.android_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;



public class Android_2_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_2_);
    }
    private int num=5;

    public void submitOrder(View view)
    {
        display(num);
        displayPrice(num*5);
    }
    public void increment(View view)
    {
        num++;
        display(num);
        displayPrice(num*5);

    }
    public void decrement(View view)
    {
        num--;
        display(num);
        displayPrice(num*5);

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_view);
        quantityTextView.setText("" + number);

    }

    private void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}
