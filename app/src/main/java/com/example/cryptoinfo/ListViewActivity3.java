package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3);



        com.example.cryptoinfo.infoClass[] infolist = new com.example.cryptoinfo.infoClass[3] ;
        infolist[0]= new com.example.cryptoinfo.infoClass("آموزش کار با صرافی" ,  R.mipmap.k1_mohit);
        infolist[1]= new com.example.cryptoinfo.infoClass("نحوه خرید و فروش"  , R.mipmap.k2_kharidfroosh);
        infolist[2]= new com.example.cryptoinfo.infoClass("ترید" , R.mipmap.k3_traid);




        ListView list =(ListView)findViewById(R.id.galleryListView);
        ListViewAdapter adapter = new ListViewAdapter(ListViewActivity3.this , infolist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListViewActivity3.this , ShowImageActivity3.class);
                i.putExtra("CHOOSED_IMAGE",position);
                startActivity(i);
            }
        });

    }
}