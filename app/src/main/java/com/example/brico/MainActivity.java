package com.example.brico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public EditText el, ep;
    public Button b1;
    public static String log, pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         el = (EditText) findViewById(R.id.log);
        ep = (EditText) findViewById(R.id.psswd);
        b1 = (Button) findViewById(R.id.v);
        b1.setOnClickListener(b1Listener);
    }

    private View.OnClickListener b1Listener = new View.OnClickListener() {
        public void onClick(View v) {
            log = el.getText().toString();
            pd = ep.getText().toString();
            Log.i("clicktoast" , "ok doki ");
            Log.i("clicktoast" , "ok doki <<<<<<<<<<");
            if(log.equals("sejine") & pd.equals("sejine")) {
                Toast.makeText(getApplicationContext(), "succes!!!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,Menu.class);
                startActivity(i);
            }
            else
                Toast.makeText(getApplicationContext(),"ERROR 404!!!",Toast.LENGTH_LONG).show();

        }



    };



}










