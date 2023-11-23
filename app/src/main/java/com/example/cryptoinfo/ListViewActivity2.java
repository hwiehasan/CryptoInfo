package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);



        com.example.cryptoinfo.infoClass[] infolist = new com.example.cryptoinfo.infoClass[3] ;
        infolist[0]= new com.example.cryptoinfo.infoClass("نرم افزاری" ,  R.mipmap.w1_software);
        infolist[1]= new com.example.cryptoinfo.infoClass("سخت افزاری"  , R.mipmap.w2_hardware);
        infolist[2]= new com.example.cryptoinfo.infoClass("تحت وب" , R.mipmap.w3_website);




        ListView list =(ListView)findViewById(R.id.galleryListView);
        ListViewAdapter adapter = new ListViewAdapter(ListViewActivity2.this , infolist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListViewActivity2.this , ShowImageActivity2.class);
                i.putExtra("CHOOSED_IMAGE",position);
                startActivity(i);
            }
        });

    }
}