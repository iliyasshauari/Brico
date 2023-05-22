package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListInt extends AppCompatActivity {
    public ListView LvInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_int);
        LvInt = (ListView) findViewById(R.id.lvInt);
        ArrayList<Interv> lInt = new ArrayList<Interv>();
        Interv oo = new Interv(0,"jjjj","uuuu","oo","pp","ii",true);
        DBINTERV dbinterv = new DBINTERV(this);
        Interv in1 = new Interv(
                getIntent().getExtras().getInt("iId"),
                getIntent().getStringExtra("nomClient"),
                getIntent().getStringExtra("mobileClient"),
                getIntent().getStringExtra("titreInt"),
                getIntent().getStringExtra("dateInt"),
                getIntent().getStringExtra("description"),
                Boolean.parseBoolean(getIntent().getExtras().getString("ExeInt")));
        lInt.add(oo);

        //dbinterv.ajouterInt(oo);
        //lInt = dbinterv.getAllnt();
        ListAdapter lAdapt = new ArrayAdapter<Interv>(this,android.R.layout.simple_list_item_1,lInt);
        LvInt.setAdapter(lAdapt);

    }
    public class CustomAdapter extends ArrayAdapter<Interv> {

        private ArrayList<Interv> dataSet;

        public CustomAdapter(ArrayList<Interv> data, Context context) {
            super(context, R.layout.view1, data);
          //  this.dataSet = data;
         //   this.mContext=context;

        }
/*
        @Override
        public void onClick(View v) {

            int position=(Integer) v.getTag();
            Object object= getItem(position);
            DataModel dataModel=(DataModel)object;

            switch (v.getId())
            {
                case R.id.item_info:
                    Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
                            .setAction("No action", null).show();
                    break;
            }
        }*/



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.view1, parent, false);

            ImageView imm = row.findViewById(R.id.imm);
            TextView titre1 = row.findViewById(R.id.titre1);
            TextView date1 = row.findViewById(R.id.date1);

            //imm.setImageResource();


            return row;
        }
    }

}


