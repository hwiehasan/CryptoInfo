package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);



        com.example.cryptoinfo.infoClass[] infolist = new com.example.cryptoinfo.infoClass[4] ;
        infolist[0]= new com.example.cryptoinfo.infoClass("توضیحات صرافی بایننس" ,  R.mipmap.s1_binance);
        infolist[1]= new com.example.cryptoinfo.infoClass("توضیحات صرافی کوین بیس"  , R.mipmap.s2_coinbase);
        infolist[2]= new com.example.cryptoinfo.infoClass("توضیحات صرافی کوینیکس" , R.mipmap.s3_coinex);
        infolist[3]= new com.example.cryptoinfo.infoClass("توضیحات صرافی هابی گلوبال"  , R.mipmap.s4_huobiglobal);



        ListView list =(ListView)findViewById(R.id.galleryListView);
        ListViewAdapter adapter = new ListViewAdapter(ListViewActivity.this , infolist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListViewActivity.this , ShowImageActivity1.class);
                i.putExtra("CHOOSED_IMAGE",position);
                startActivity(i);
            }
        });

    }
}