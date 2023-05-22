package com.example.brico;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBINTERV extends SQLiteOpenHelper{

       public static final String DBNAME = "interv1";
       public static final int DBV = 2;

       public   DBINTERV(@Nullable Context context) {
           super(context, DBNAME, null, DBV);
       }

       @Override
       public void onCreate(SQLiteDatabase db) {
           String req = "CREATE TABLE INTER ( iId integer primary key autoincrement," +
                   "nomClient text not null ,"  +"mobileCient text not null ," + " titreInt text not null, "
                   +"dateInt text not null ," +"description text not null," +"ExeInt text not null)";
            //lc = dbi.getCat();
           db.execSQL(req);

       }


       @Override
       public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           String req = "drop table INTER";
           db.execSQL(req);
       }

       public boolean ajouterInt(Interv in1){

           boolean res=false;
           String req=" insert into INTER(nomClient, mobileClient,titreInt,dateInt,description,ExeInt)"+
                   "values("+in1.nomClient+"','"+in1.mobileClient+"','"+in1.titreInt+"','"+in1.dateInt+"','"+in1.description+"','"+in1.ExeInt+"')";

           try {
               this.getWritableDatabase().execSQL(req);
               res=true;

           }
           catch (Exception e){
               res=false;
           }
           return res;
       }




       public ArrayList<Interv> getAllnt() {
           ArrayList<Interv> l = new ArrayList<Interv>();
           String req = "SELECT * FROM INTER";
           Cursor c = this.getReadableDatabase().rawQuery(req, null);
           c.moveToFirst();
           while (c.isAfterLast() != true) {
               Interv int1 = new Interv(c.getInt(0), c.getString(1),
                       c.getString(2), c.getString(3), c.getString(4),
                       c.getString(5),Boolean.parseBoolean(c.getString(6)));
               l.add(int1);
               c.moveToNext();
           }
           c.close();
           return l;
       }


   }





