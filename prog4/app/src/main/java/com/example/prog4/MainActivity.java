package com.example.prog4;

import

        androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.graphics.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg=Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        ImageView i=(ImageView) findViewById(R.id.imageView);
        i.setBackground(new BitmapDrawable
                (bg));
        Canvas canvas=new Canvas(bg);
        Paint paint=new Paint();

       paint.setColor(Color.GREEN);
        canvas.drawRect(400,200,650,700,paint);

        paint.setColor(Color.BLUE);
        canvas.drawLine(500,800,500,1110,paint);


        paint.setColor(Color.RED);
        canvas.drawRect(50,850,350,1150,paint);
    }
}