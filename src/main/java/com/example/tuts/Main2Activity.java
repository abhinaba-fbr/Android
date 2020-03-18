package com.example.tuts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.content.res.Resources;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main2);
        super.onCreate(savedInstanceState);
        Bundle extras=getIntent().getExtras();
        String name=extras.getString("imageName");
        ImageView img=(ImageView)findViewById(R.id.displayImage);
        img.setImageResource(getResources().getIdentifier(name,"drawable",getPackageName()));

        final Main2Activity obj=this;
        Button back=(Button)findViewById(R.id.back);
        back.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent I=new Intent(obj,MainActivity.class);
                        startActivity(I);
                    }
                }
        );

    }

}
