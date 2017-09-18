package com.gtatiya.mytinyapp_gt3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView tv1,tv2;
    RadioButton rb1,rb2,rb3,rb4,rb5, rb6, rb7;
    Button b4;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1= (TextView) findViewById(R.id.textview1);
        tv2= (TextView) findViewById(R.id.textview2);
        rb1= (RadioButton) findViewById(R.id.radio1);
        rb2= (RadioButton) findViewById(R.id.radio2);
        rb3= (RadioButton) findViewById(R.id.radio3);
        rb4= (RadioButton) findViewById(R.id.radio4);
        rb5= (RadioButton) findViewById(R.id.radio5);
        rb6= (RadioButton) findViewById(R.id.radio6);
        rb7= (RadioButton) findViewById(R.id.radio7);
        b4= (Button) findViewById(R.id.button4);

        Intent i=getIntent();
        Bundle b=i.getExtras();
        s=b.getString("platform");
        switch(s)
        {
            case "Android":
                tv1.setText("Selected platform is "+s);
            case "iPhone":
                tv1.setText("Selected platform is "+s);
            case "Windows Phone":
                tv1.setText("Selected platform is "+s);
        }

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                if(rb1.isChecked())
                {
                    i.putExtra("price","50-100");
                    i.putExtra("platform",s);
                }
                if(rb2.isChecked())
                {
                    i.putExtra("price","100-200");
                    i.putExtra("platform",s);
                }
                if(rb3.isChecked())
                {
                    i.putExtra("price","200-300");
                    i.putExtra("platform",s);
                }

                if(rb4.isChecked())
                {
                    i.putExtra("memory","8 GB");
                    i.putExtra("platform",s);
                }
                if(rb5.isChecked())
                {
                    i.putExtra("memory","16 GB");
                    i.putExtra("platform",s);
                }
                if(rb6.isChecked())
                {
                    i.putExtra("memory","32 GB");
                    i.putExtra("platform",s);
                }
                if(rb7.isChecked())
                {
                    i.putExtra("memory","64 GB");
                    i.putExtra("platform",s);
                }
                if(!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() ) {
                    Toast.makeText(Main2Activity.this, "please select any one price", Toast.LENGTH_SHORT).show();
                }
                else if(!rb4.isChecked() && !rb5.isChecked() && !rb6.isChecked() && !rb7.isChecked()){
                    Toast.makeText(Main2Activity.this, "please select any one memory", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(i);
                }


            }
        });

    }
}
