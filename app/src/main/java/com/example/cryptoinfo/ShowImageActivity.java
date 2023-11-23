package com.example.cryptoinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class ShowImageActivity extends AppCompatActivity {

    private Integer imageID ;
    private ImageView bigImage ;
    private TextView imagesDescription ;



    Integer [] imagesList = {
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

    String[] descriptions = {

            "نام ارز : بیتکوین\n" +
                    "\n" +
                    "نام به انگلیسی : Bitcoin\n" +
                    "\n" +
                    "نماد : BTC\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین نهصد میلیون تا یک میلیارد و پونصد\n" +
                    "\n" +
                    "رنج قیمت به دلار : 40000$ _ 60000$" ,
            "نام ارز : دش\n" +
                    "\n" +
                    "نام به انگلیسی : Dash\n" +
                    "\n" +
                    "نماد : DASH\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین چهار میلیون تا هشت میلیون\n" +
                    "\n" +
                    "رنج قیمت به دلار : 160$ _ 320$" ,
            "نام ارز : کاردانو\n" +
                    "\n" +
                    "نام به انگلیسی : Cardano\n" +
                    "\n" +
                    "نماد : ADA\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین سی و سه هزار تا چهل هزار\n" +
                    "\n" +
                    "رنج قیمت به دلار : 1.52$ _ 1.73$" ,
            "نام ارز : دوج کوین\n" +
                    "\n" +
                    "نام به انگلیسی : Dogecoin\n" +
                    "\n" +
                    "نماد : DOGE\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین هفت هزار تا چهارده هزار\n" +
                    "\n" +
                    "رنج قیمت به دلار : 0.3$ _ 0.61$" ,
            "نام ارز : اتریوم\n" +
                    "\n" +
                    "نام به انگلیسی : Ethereum\n" +
                    "\n" +
                    "نماد : ETH\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین پنجاه و شش میلیون تا شصت میلیون\n" +
                    "\n" +
                    "رنج قیمت به دلار : 2300$ _ 2500$" ,
            "نام ارز : لایتکوین\n" +
                    "\n" +
                    "نام به انگلیسی : Litecoin\n" +
                    "\n" +
                    "نماد : LTC\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین سه میلیون و نهصد تا پنج میلیون و صد\n" +
                    "\n" +
                    "رنج قیمت به دلار : 164$ _ 211$" ,
            "نام ارز : تتر\n" +
                    "\n" +
                    "نام به انگلیسی : Tether\n" +
                    "\n" +
                    "نماد : USDT\n" +
                    "\n" +
                    "رنج قیمت به تومان : بیست و چهار هزار تومن\n" +
                    "\n" +
                    "رنج قیمت به دلار : 1$\n" +
                    "\n" +
                    "به این نوع ارز که قیمت پایه و همیشگی یک دلار را دارید استیبل کوین نیز گویند" ,
            "نام ارز : ترون\n" +
                    "\n" +
                    "نام به انگلیسی : TRON\n" +
                    "\n" +
                    "نماد : TRX\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین هزار و هشتصد تا سه هزار\n" +
                    "\n" +
                    "رنج قیمت به دلار : 0.073$ _ 0.127$\n" ,
            "نام ارز : مونرو\n" +
                    "\n" +
                    "نام به انگلیسی : Monero\n" +
                    "\n" +
                    "نماد : XMR\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین پنج میلیون و چهارصد تا شش میلیون و سیصد\n" +
                    "\n" +
                    "رنج قیمت به دلار : 224$ _ 271$\n" ,
            "نام ارز : ریپل\n" +
                    "\n" +
                    "نام به انگلیسی : Ripple\n" +
                    "\n" +
                    "نماد : XRP\n" +
                    "\n" +
                    "رنج قیمت به تومان : بین بیست هزار تا سی و پنج هزار\n" +
                    "\n" +
                    "رنج قیمت به دلار : 0.86$ _ 1.47$\n"

    };
    //.............................................................





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        Intent i = getIntent();
        imageID = i.getIntExtra("CHOOSED_IMAGE" , 0 );

        bigImage = (ImageView)findViewById(R.id.bigImage);
        imagesDescription = (TextView)findViewById(R.id.imageDescription) ;

        bigImage.setImageResource(imagesList[imageID]);
        imagesDescription.setText(descriptions[imageID]);

    }

    public void showNextImage(View view) {
        imageID++ ;
      /*  if(imageID >= imagesList.length)
        {
            bigImage.setImageResource(imagesList[imageID]);
        }
        else
        {
            imageID = 0 ;
            bigImage.setImageResource(imagesList[imageID]);
        } */
        if(imageID>= imagesList.length)
            imageID = 0 ;
        bigImage.setImageResource(imagesList[imageID]);
        imagesDescription.setText(descriptions[imageID]);
    }

    public void showPreImage(View view) {
        imageID-- ;
        if(imageID<0)
            imageID = imagesList.length -1 ;
        bigImage.setImageResource(imagesList[imageID]);
        imagesDescription.setText(descriptions[imageID]);
    }

    public void home(View view) {
        finish();
    }
}