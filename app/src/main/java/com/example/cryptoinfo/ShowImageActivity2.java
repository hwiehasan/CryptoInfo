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

public class ShowImageActivity2 extends AppCompatActivity {

    private Integer imageID ;
    private ImageView bigImage ;
    private TextView imagesDescription ;



    Integer [] imagesList = {
            R.mipmap.w1_software ,
            R.mipmap.w2_hardware ,
            R.mipmap.w3_website ,


    };

    String[] descriptions = {

            "کیف پول نرم افزاری\n" +
                    "\n" +
                    "در کیف پول های نرم افزاری شما با نصب یک برنامه مانند تراست ولت صاحب یک کیف پول دیجیتال میشوید . این کیف پول به شما برای هر ارز یک ادرس اختصاص میدهد که با ان میتوانید ارز مورد نظر خود را دریافت کنید\n" +
                    "\n" +
                    "چند نمونه از کیف پول های نرم افزاری که با سرپ در اینترنت میتوانید آنها را نصب و از آن استفاده کنید .\n" +
                    "\n" +
                    "Trustwallet\n" +
                    "\n" +
                    "safepall\n" +
                    "\n" +
                    "wavesExchange\n" +
                    "\n" +
                    "Atomic\n" +
                    "\n" +
                    "Metamask\n" +
                    "\n" +
                    "Guarda" ,
            "کیف پول سخت افزاری\n" +
                    "\n" +
                    "کیف پول سخت افزاری مانند یک تلفن همراه یک سخت افزار هست که با خرید آن میتوانید ارزهای خود را در آن ذخیره کنید و بسته به نوع خریداری شده میتوانید ادرس ان ارز مخصوص به خود را دریافت کنید و برای واریزی و یا در خود این کیف پول به پرداخت بپردازید . \n" +
                    "\n" +
                    "چند نمونه از کیف پول های سخت افزاری : \n" +
                    "\n" +
                    "Ledger Nano S\n" +
                    "\n" +
                    "Trezor Model T\n" +
                    "\n" +
                    "KeepKey\n" +
                    "\n" +
                    "BitBox02\n" +
                    "\n" +
                    "Coldcard Mk3\n" +
                    "\n" ,
            "کیف پول های تحت وب\n" +
                    "\n" +
                    "این نوع کیف پول ها یک سایت هستند که با وارد کردن آن در مرورگر و ثبت نام در آن سایت صاحب کیف پول ارز دیجیتال میشوید . بعضا یک ارز و بعضا چند نوع ارز را پشتیبانی میکنند و مانند کیف پول های نرم و سخت افزاری برای ارز مورد نظر به شما آدرسی برای واریز و قسمتی برای برداشت دارند .\n" +
                    "\n" +
                    "چند وب سایت برای کیف پول های تحت وب :\n" +
                    "\n" +
                    "blockchain.com\n" +
                    "\n" +
                    "myetherwallet.com\n" +
                    "\n" +
                    "dogechain.info"


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image2);

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