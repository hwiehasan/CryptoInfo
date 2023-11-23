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

public class ShowImageActivity3 extends AppCompatActivity {

    private Integer imageID ;
    private ImageView bigImage ;
    private TextView imagesDescription ;



    Integer [] imagesList = {
            R.mipmap.k1_mohit ,
            R.mipmap.k2_kharidfroosh ,
            R.mipmap.k3_traid ,


    };

    String[] descriptions = {

            "اشنایی با محیط صرافی :\n" +
                    "\n" +
                    "قبل از هر چیزی باید در صرافی مورد نظر ثبت نام کنید که با وارد کردن ایمیل انجام میشود  .برای دسترسی بیشتر و افزایش معاملات اکثر صرافی ها بخشی را برای ارتقاع حساب دارند که با ثبت آن به انها دسترسی پیدا میکنید .صرافی های یک بخش به نام ولت دارند که مانند یک کیف پول هست و شما میتوانید ارز مورد نظر خود را واریز یا از حساب برداشت کنید .بخش دیگر مارکت نام دارد که ارزها را میتوان در ان دید و میتوان فهمید چه ارز هایی را میتوان به ارز های دیگر تبدیل کرد  .برای هر کدام نمودار ها و تحلیل هایی وجود دارد " ,
            "نحوه خرید و فروش :\n" +
                    "\n" +
                    "در صرافی های ارز دیجیتال میتوان به خرید و فروش ارز پرداخت . صرافی ها در خود کیف پول ارز دیجیتال دارند و کاربر با آن میتوانید به ولت صرافی خود ارزی را وارد و یا برداشت کند . برای واریز ابتدا باید رو عبارت deposit کلیک کنید و ارز دیجیتال مورد نظر خود را پیدا کرده و ادرس خود را برای واریز ارز به شخص یا طرف مقابل میدهیم . برای برداشت در کنار عبارت deposit  عبارت withdraw وجود دارد که با کلیک بر روی ان به صفحه ای منتقل میشوید .\n" +
                    "\n" +
                    "حال باید به سایت های نقد کردن ارز دیجیتال وارد شوید ثبت نام کرده و درخواست فروش ارز بدهید . سایت به شما یک ادرس کیف پول میدهد که با کپی کردن ان در بخش withdraw و وارد کردن مبلغ ارز به سایت مقصد میرود و شما در قبال آن میتوانید پول بصورت ریال دریافت کنید ." ,
            "ترید :\n" +
                    "\n" +
                    "به تبدیل ارز های دیجیتال به هم ترید گفته میشود . بدین منظور ابتدا ما نیاز داریم ارزی را در کیف پول صرافی خود داشته باشیم بسته به نوع صرافی به بخش exchange یا trade یا market رفته و ارز خود را برای تبدیل سرچ میکنیم . ارز جست و جو شده را در کنار تعدادی ارز دیگر نمایش میدهد که میتوانید آنها را تبدیل به هم کنید . بر روی sell کلیک کنید مقدار ارز برای تبدیل به ارز موجود را وارد میکنید و تایید را میزنید . برای این کار باید مقداری کارمزد که مقدار آن کمتر از یک دلار است نیز باید بپردازید که از ارز تبدیل شده کسر میشود . کار تمام است و ارز شما تبدیل شده است ."


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image3);

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