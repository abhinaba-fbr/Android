package com.example.tuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.graphics.Color.BLACK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ig1=(ImageView)findViewById(R.id.wall1);
        final ImageView ig2=(ImageView)findViewById(R.id.wall2);
        final ImageView ig3=(ImageView)findViewById(R.id.wall3);
        final ImageView ig4=(ImageView)findViewById(R.id.wall4);
        final ImageView ig5=(ImageView)findViewById(R.id.wall5);
        final ImageView ig6=(ImageView)findViewById(R.id.wall6);

        //click listener for Image1
        ig1.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig1.setBackgroundColor(Color.BLACK);
                        ig2.setBackgroundColor(Color.WHITE);
                        ig3.setBackgroundColor(Color.WHITE);
                        ig4.setBackgroundColor(Color.WHITE);
                        ig5.setBackgroundColor(Color.WHITE);
                        ig6.setBackgroundColor(Color.WHITE);
                        ig1.setTag("true");
                        ig2.setTag("false");
                        ig3.setTag("false");
                        ig4.setTag("false");
                        ig5.setTag("false");
                        ig6.setTag("false");
                    }
                }
        );

        //click listener for Image2
        ig2.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig2.setBackgroundColor(Color.BLACK);
                        ig1.setBackgroundColor(Color.WHITE);
                        ig3.setBackgroundColor(Color.WHITE);
                        ig4.setBackgroundColor(Color.WHITE);
                        ig5.setBackgroundColor(Color.WHITE);
                        ig6.setBackgroundColor(Color.WHITE);
                        ig2.setTag("true");
                        ig1.setTag("false");
                        ig3.setTag("false");
                        ig4.setTag("false");
                        ig5.setTag("false");
                        ig6.setTag("false");
                    }
                }
        );

        //click listener for Image3
        ig3.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig3.setBackgroundColor(Color.BLACK);
                        ig1.setBackgroundColor(Color.WHITE);
                        ig2.setBackgroundColor(Color.WHITE);
                        ig4.setBackgroundColor(Color.WHITE);
                        ig5.setBackgroundColor(Color.WHITE);
                        ig6.setBackgroundColor(Color.WHITE);
                        ig3.setTag("true");
                        ig1.setTag("false");
                        ig2.setTag("false");
                        ig4.setTag("false");
                        ig5.setTag("false");
                        ig6.setTag("false");
                    }
                }
        );

        //click listener for Image4
        ig4.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig4.setBackgroundColor(Color.BLACK);
                        ig1.setBackgroundColor(Color.WHITE);
                        ig3.setBackgroundColor(Color.WHITE);
                        ig2.setBackgroundColor(Color.WHITE);
                        ig5.setBackgroundColor(Color.WHITE);
                        ig6.setBackgroundColor(Color.WHITE);
                        ig4.setTag("true");
                        ig2.setTag("false");
                        ig3.setTag("false");
                        ig1.setTag("false");
                        ig5.setTag("false");
                        ig6.setTag("false");
                    }
                }
        );


        //click listener for Image5
        ig5.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig5.setBackgroundColor(Color.BLACK);
                        ig1.setBackgroundColor(Color.WHITE);
                        ig3.setBackgroundColor(Color.WHITE);
                        ig4.setBackgroundColor(Color.WHITE);
                        ig2.setBackgroundColor(Color.WHITE);
                        ig6.setBackgroundColor(Color.WHITE);
                        ig5.setTag("true");
                        ig2.setTag("false");
                        ig3.setTag("false");
                        ig4.setTag("false");
                        ig1.setTag("false");
                        ig6.setTag("false");
                    }
                }
        );

        //click listener for Image6
        ig6.setOnClickListener(
                new ImageView.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ig6.setBackgroundColor(Color.BLACK);
                        ig1.setBackgroundColor(Color.WHITE);
                        ig3.setBackgroundColor(Color.WHITE);
                        ig4.setBackgroundColor(Color.WHITE);
                        ig5.setBackgroundColor(Color.WHITE);
                        ig2.setBackgroundColor(Color.WHITE);
                        ig6.setTag("true");
                        ig2.setTag("false");
                        ig3.setTag("false");
                        ig4.setTag("false");
                        ig5.setTag("false");
                        ig1.setTag("false");
                    }
                }
        );

        final MainActivity obj=this;
        Button btn=(Button) findViewById(R.id.linkButton);
        btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent I=new Intent(obj,Main2Activity.class);
                        String msg="wallpaper";
                        if(ig1.getTag()=="true")
                            msg+="1";
                        else if(ig2.getTag()=="true")
                            msg+="2";
                        else if(ig3.getTag()=="true")
                            msg+="3";
                        else if(ig4.getTag()=="true")
                            msg+="4";
                        else if(ig5.getTag()=="true")
                            msg+="5";
                        else if(ig6.getTag()=="true")
                            msg+="6";
                        else
                            return;
                        I.putExtra("imageName",msg);
                        startActivity(I);
                    }
                }
        );

    }
}
