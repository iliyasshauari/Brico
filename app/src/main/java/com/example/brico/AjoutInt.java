package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class AjoutInt extends AppCompatActivity {
    public Button bV1;
    public EditText eId,eNc,eMc,eTi,eDi,eDes;
    public  Switch s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_int);
        bV1 = (Button) findViewById(R.id.bt1);
        eId = (EditText) findViewById(R.id.idInt);
        eNc = (EditText) findViewById(R.id.nCli);
        eMc = (EditText) findViewById(R.id.mobCli);
        eTi = (EditText) findViewById(R.id.titreI);
        eDi = (EditText) findViewById(R.id.dateI);
        eDes = (EditText) findViewById(R.id.desc);
        s1 = (Switch) findViewById(R.id.switch1) ;
        bV1.setOnClickListener(bV1Listner);

    }

    private View.OnClickListener bV1Listner = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

           /* Intent i1 = new Intent(AjoutInt.this,Menu.class);

            i1.putExtra("iId",Integer.parseInt(eId.getText().toString()));
            //Log.i("clicktoast" , "ok doki <<<<<<<<<<");
            startActivity(i1); */
            Intent i1 = new Intent(AjoutInt.this,ListInt.class);
            i1.putExtra("nomCliet",eNc.getText().toString());
            i1.putExtra("mobileClient",eMc.getText().toString());
            i1.putExtra("titreInt",eTi.getText().toString());
            i1.putExtra("dateInt",eDi.getText().toString());
            i1.putExtra("description",eDes.getText().toString());
            i1.putExtra("ExeInt",s1.isChecked());

            /*Interv in1 = new Interv(Integer.parseInt(eId.getText().toString()),eNc.getText().toString(),
                    eMc.getText().toString(),eTi.getText().toString(),eDi.getText().toString(),eDes.getText().toString(),
                    s1.isChecked());*/
         //   i1.putExtra("intt",i1);
            Toast.makeText(getApplicationContext(),"inetrvention added succesfully",Toast.LENGTH_LONG).show();
            startActivity(i1);

        }
    };

}
