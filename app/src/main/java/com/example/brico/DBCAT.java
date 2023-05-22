package com.example.brico;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBCAT extends SQLiteOpenHelper {
    public static final String DBNAME = "cat1";
    public static final int DBV = 2;
    public DBCAT(Context context){
        super(context,DBNAME,null,DBV);
    }

    public void onCreate(SQLiteDatabase db) {
        String req = "CREATE TABLE CAT ( idCat integer primary key autoincrement, " +
                "nameCat text not null)   ";
        Log.i("DBUSER", "DB created success");
        db.execSQL(req);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String req = "drop table CAT";
        db.execSQL(req);
        this.onCreate(db);
    }

    public boolean ajouterCat(Catego ca1){
        boolean res=false;
        String req="insert into CAT(name)"+
                "values("+ca1.name+"')";
        try{
            this.getWritableDatabase().execSQL(req);
            res=true;
        }
        catch (Exception e1){
            res=false;
        }
        return res;

    }
    public ArrayList<Catego> getCat() {
        ArrayList<Catego> l = new ArrayList<Catego>();
        String req = "SELECT * FROM CAT";
        Cursor c = this.getReadableDatabase().rawQuery(req, null);
        c.moveToFirst();
        while (c.isAfterLast() != true) {
            Catego cat = new Catego(c.getInt(0),c.getString(1));
            l.add(cat);
            c.moveToNext();
        }
        c.close();
        return l;
    }
}
