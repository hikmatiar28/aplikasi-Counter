package com.counter.myapplication;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int angka = 0;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Hitung(View view) {
        angka++;
        TextView textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(angka));
        Vibrator vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        if (angka == 33 ) {
            vibe.vibrate(2000);
        }
        if (angka == 34) {
            reset(v);
        }
    }

    public void reset(View view) {
        angka = 0;
        TextView textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(angka));

        String pesan = "Berhasil direset";
        Toast notif = Toast.makeText(this, pesan,Toast.LENGTH_LONG);
        notif.setGravity(Gravity.FILL_HORIZONTAL, 0, -500);
        notif.show();
    }
}
