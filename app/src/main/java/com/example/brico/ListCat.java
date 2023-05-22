package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListCat extends AppCompatActivity {
    private ListView lvCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cat);
        lvCat =(ListView) findViewById(R.id.lvCat);
        ArrayList lc =new ArrayList<Catego>();
        String s;

        s = getIntent().getExtras().getString("nameCat");
        Catego a =new Catego(s);
        DBCAT dbi = new DBCAT(this);
        dbi.ajouterCat(a);
        lc = dbi.getCat();




        Log.i("tag1", "dim liste " +lc.size());

            ListAdapter adaptateurc = new ArrayAdapter<Catego>(this, android.R.layout.simple_list_item_1, lc);
            lvCat.setAdapter(adaptateurc);
        }


    }

