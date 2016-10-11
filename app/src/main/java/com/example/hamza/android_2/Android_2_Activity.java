package com.example.hamza.android_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Android_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_2_);
    }

    public void display(View view) {
        display(1);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_view);
        quantityTextView.setText("" + number);

    }
}
