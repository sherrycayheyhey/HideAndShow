package com.chromsicle.hideandshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the TextView
        helloText = findViewById(R.id.helloTextView);
    }

    public void showButtonClicked(View view) {
        helloText.setVisibility(View.VISIBLE);
    }

    public void hideButtonClicked(View view) {
        helloText.setVisibility(View.INVISIBLE);
    }
}
