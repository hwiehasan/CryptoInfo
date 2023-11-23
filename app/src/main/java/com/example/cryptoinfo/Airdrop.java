package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Airdrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airdrop);
    }

    public void homeAirdrop(View view) {

        Intent i = new Intent(Airdrop.this, MainActivity.class);
        startActivity(i);
    }
}