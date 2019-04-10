package com.counter.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void sendData (View v){

        //crete object intent
        Intent intent = new Intent(this, Main2Activity.class);

        //put data
        Intent.setData(Uri.parse("Selamat Datang"));
        //start activity
        startActivity(intent);
    }

    public void sendExtras(){

    }
}
