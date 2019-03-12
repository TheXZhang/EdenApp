package com.sdp.eden;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
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
    }

    public void send_(View view){
        WindowManager wm = (WindowManager) this.getSystemService(this.WINDOW_SERVICE);
        Point size = new Point();
        wm.getDefaultDisplay().getRealSize(size);
        float img_height= (float) (size.x*0.97);
        float img_width=(float) (size.y*0.48);
        float currentX=  PictureTagLayout.returnX();
        float currentY=  PictureTagLayout.returnY();
        float currentXratio=currentX/img_width;
        float currentYratio=currentY/img_height;
        Log.d("testing1","valueX" +  currentXratio);
        Log.d("testing1","valueY" +  currentYratio);
    }



}