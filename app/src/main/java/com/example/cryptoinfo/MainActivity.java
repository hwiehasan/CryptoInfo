package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moarrefiArz(View view) {
        Intent i = new Intent(MainActivity.this, GridMoarrefiArzActivity.class);
        startActivity(i);
    }

    public void sarrafi(View view) {
        Intent i = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(i);
    }

    public void wallet(View view) {
        Intent i = new Intent(MainActivity.this, ListViewActivity2.class);
        startActivity(i);
    }

    public void karbasarrafi(View view) {
        Intent i = new Intent(MainActivity.this, ListViewActivity3.class);
        startActivity(i);
    }

    public void airdrop(View view) {
        Intent i = new Intent(MainActivity.this, Airdrop.class);
        startActivity(i);
    }

    public void ayamidanid(View view) {
        Intent i = new Intent(MainActivity.this, AyaMidanid.class);
        startActivity(i);
    }

    public void logotApp(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("خروج");
        alert.setMessage("آیا مایل به خروج از برنامه هستید");
        alert.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        alert.setNeutralButton("بستن برنامه", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();

            }
        });

        alert.show();
    }

    public void setting(View view) {
        Intent i = new Intent(MainActivity.this, Setting.class);
        startActivity(i);
    }
}