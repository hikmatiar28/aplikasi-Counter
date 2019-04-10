package com.counter.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Latihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
    }

    public void changeText (View view){
        TextView helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText("Welcome");
    }
    public void goToCounter (View v){
        Intent counter = new Intent (this, Main2Activity.class);
        startActivity(counter);
    }
}
