package com.sdp.eden;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class PictureTagMain extends AppCompatActivity {

    public View img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.picturetag_main);
        img = findViewById(R.id.overhead_image);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.overhead_image);
        Drawable d = new BitmapDrawable(getResources(), bmp);
        img.setBackground(d);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.overhead_image);

    }

    public void send_(View view){
        Log.d("testing1","valueX" +  PictureTagLayout.returnX());
        Log.d("testing1","valueY" +  PictureTagLayout.returnY());
    }

}