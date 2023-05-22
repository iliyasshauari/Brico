package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjoutCat extends AppCompatActivity {
    public EditText e1,e2;
    public Button b1;
    public static int idCat;
    public static String nameCat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_cat);
        e1 = (EditText) findViewById(R.id.idCat);
        e2 = (EditText) findViewById(R.id.nameCat);
        b1 = (Button) findViewById(R.id.save);
        b1.setOnClickListener(b1Listner);


    }
    private View.OnClickListener b1Listner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         nameCat = e2.getText().toString();

            Intent i = new Intent(AjoutCat.this,ListCat.class);
            i.putExtra("nameCat",nameCat);
            startActivity(i);


        }
    };
    DBINTERV dbi = new DBINTERV(this);

}
