package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Google extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
    }
    public void azz(View view)
    {
        Intent i = new Intent(this,AboutG.class);
        startActivity(i);
    }
    public void yuio(View view){
        Intent i = new Intent(this,Careerg.class);
        startActivity(i);
    }
    public void zzl(View view){
        Intent i = new Intent(this,Contactg.class);
        startActivity(i);
    }
    public void dee(View view){
        Intent i = new Intent(this,Signig.class);
        startActivity(i);
    }
    public void qqqe(View view){
        Intent i = new Intent(this,Signug.class);
        startActivity(i);
    }

}
