package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    public Button bAi,bAc,bLi,bLc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bAi = (Button) findViewById(R.id.AjInt);
        bAc = (Button) findViewById(R.id.AjCat);
        bLi = (Button) findViewById(R.id.LiInt);
        bLc = (Button) findViewById(R.id.LiCat);
        bAi.setOnClickListener(bAiListner);
        bAc.setOnClickListener(bAcListener);
        bLi.setOnClickListener(bLiListner);
        bLc.setOnClickListener(bLcListner);
    }
    private View.OnClickListener bAiListner = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Menu.this,AjoutInt.class);
            startActivity(i);

        }
    };

    private View.OnClickListener bAcListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent a = new Intent(Menu.this,AjoutCat.class);
            startActivity(a);


        }
    };

    private View.OnClickListener bLiListner = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent a1 =new Intent(Menu.this,ListInt.class);
            startActivity(a1);

        }
    };

    private View.OnClickListener bLcListner = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent c1 = new Intent(Menu.this,ListCat.class);
            startActivity(c1);

        }
    };



}
