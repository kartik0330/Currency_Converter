package com.example.android.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConvert(View view){

        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        double value = Double.parseDouble(editText.getText().toString());

        double finalValueInDollars = value*(1.24);

        Toast.makeText(this, "£" + String.format("%.2f", value) + " is $" + String.format("%.2f", finalValueInDollars), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
