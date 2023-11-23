package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridMoarrefiArzActivity extends AppCompatActivity {

    Integer [] images = {
            R.mipmap.a1_bitcoin ,
            R.mipmap.a2_dash ,
            R.mipmap.a3_cardano ,
            R.mipmap.a4_dogecoin ,
            R.mipmap.a5_ethereum ,
            R.mipmap.a6_litecoin ,
            R.mipmap.a7_tether ,
            R.mipmap.a8_tron,
            R.mipmap.a9_xmr ,
            R.mipmap.a10_xrp

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_moarrefi_arz);

        GridView gridView = (GridView) findViewById(R.id.myGridView);
        GridAdapter adapter = new GridAdapter(GridMoarrefiArzActivity.this, images);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(GridMoarrefiArzActivity.this,ShowImageActivity.class);
                i.putExtra("CHOOSED_IMAGE", position);
                i.putExtra("GRID",position);
                startActivity(i);

            }
        });


    }
}