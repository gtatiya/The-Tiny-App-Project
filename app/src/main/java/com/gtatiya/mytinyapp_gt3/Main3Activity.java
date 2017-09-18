package com.gtatiya.mytinyapp_gt3;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tv3;
    String s1, s2, s3;
    ImageView im1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv3= (TextView) findViewById(R.id.textview3);
        im1= (ImageView) findViewById(R.id.image1);

        Intent i=getIntent();
        Bundle b=i.getExtras();
        s1=b.getString("platform");
        s2=b.getString("price");
        s3=b.getString("memory");

        tv3.setText("Platform: " + s1 + ", Price: "+s2+", Memory: " + s3);


        if(s1.equals("Android")){
            im1.setImageResource(R.drawable.android);
        }
        if(s1.equals("iPhone")){
            im1.setImageResource(R.drawable.apple);
        }
        if(s1.equals("Windows Phone")){
            im1.setImageResource(R.drawable.windows);
        }


    }
}
