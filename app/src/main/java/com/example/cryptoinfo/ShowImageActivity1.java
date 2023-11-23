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

public class ShowImageActivity1 extends AppCompatActivity {

    private Integer imageID ;
    private ImageView bigImage ;
    private TextView imagesDescription ;


    


    Integer [] imagesList = {
            R.mipmap.s1_binance ,
            R.mipmap.s2_coinbase ,
            R.mipmap.s3_coinex ,
            R.mipmap.s4_huobiglobal


    };

    String[] descriptions = {

            "نام صرافی : بایننس\n" +
                    "\n" +
                    "آدرس سایت : bianance.com \n" +
                    "\n" +
                    "توضیحات و ویژگی های صرافی  : \n" +
                    "\n" +
                    "در سال 2017 در کشور چین به وجود آمد و بخاطر قوانین سرسختانه چین این پلتفرم را به ژاپن منتقل کردند .\n" +
                    "\n" +
                    "بیشترین ارز ها را بین صرافی ها پشتیبانیی میکند .\n" +
                    "\n" +
                    "با ای پی ایران مشکل دارد و برای استفاده باید از vps استفاده شود .\n" +
                    "\n" +
                    "کارمزد بسیار پایین در تراکنش ها .\n" +
                    "\n" +
                    "امنیت بالایی دارد .\n" +
                    "\n" ,
            "نام صرافی : کوین بیس\n" +
                    "\n" +
                    "آدرس سایت : coinbase.com\n" +
                    "\n" +
                    "توضیحات و ویژگی های صرافی  : \n" +
                    "\n" +
                    "این صرافی در کایفرنیای آمریکا بوجود آمد و کار خود را از یک بنگاه اقتصادی کوچک شروع کرد و به مرکزی بسیار بزرگ تبدیل شد که در حال حاضر پانصد نفر در آن فعالیت میکنند .\n" +
                    "\n" +
                    "ارزهای تقریبا زیادی را پشتیبانی میکند \n" +
                    "\n" +
                    "با ای پی ایران مشکل دارد و برای استفاده باید از vps استفاده شود .\n" +
                    "\n" +
                    "کارمزد های زیاد نسبت به هزینه های اعلام شده .\n" +
                    "\n" +
                    "امنیت بالایی دارد .\n" +
                    "\n" +
                    "پلتفرمی قابل درک که برای افراد مبتدی عالی هست .\n" +
                    "\n" +
                    "محدودیت در سرمایه گذاری ندارد .\n" +
                    "\n" ,
            "نام صرافی : کوینیکس\n" +
                    "\n" +
                    "آدرس سایت : coinex.com\n" +
                    "\n" +
                    "توضیحات و ویژگی های صرافی  : \n" +
                    "\n" +
                    "این صرافی در اواخر سال 2017 توسط یانگ هاپو در هنگ کنگ تاسیس شد . \n" +
                    "\n" +
                    "ارزهای پشتیبانی شده زیاد نیست و در حد متوسط هست . \n" +
                    "\n" +
                    "با ای پی ایران مشکلی ندارد و بدون هیچ محدودیتی میتوان از آن استفاده کرد .\n" +
                    "\n" +
                    "کارمزد ها نسبتا خوب است .\n" +
                    "\n" +
                    "امنیت بالایی دارد .\n" +
                    "\n" +
                    "امکانات انجام معاملات فرابورس نیز در این پلتفرم میسر است ." ,
            "نام صرافی : هابی گلوبال\n" +
                    "\n" +
                    "آدرس سایت : huobi.com\n" +
                    "\n" +
                    "توضیحات و ویژگی های صرافی  : \n" +
                    "\n" +
                    "این صرافی در سال 2013 اغاز به کار کرد و هدف آن جایگزینی ارز فیات با یک ارز دیجیتال امن برای مردم جهان بود . ابتدا در پکن فعالیت داشت و سپس در سال 2020 هابی گلد به جمهوری سیشل منتقل شد .\n" +
                    "\n" +
                    "از 318 توکن و ارز پشتیبانی میکند\n" +
                    "\n" +
                    "با ای پی ایران مشکل دارد و باید از vps استفاده کرد .\n" +
                    "\n" +
                    "فرایند ثبت نام و تایید هویت نسبت به رقبا پیچیده تر است .\n" +
                    "\n" +
                    "امنیت سایبری با سطح بالا ."

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image1);

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