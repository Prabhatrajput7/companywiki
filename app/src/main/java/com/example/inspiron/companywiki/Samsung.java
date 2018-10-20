package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Samsung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);
    }
    public void samg1(View view)
    {
        Intent i = new Intent(this,Sama.class);
        startActivity(i);
    }
    public void samg2(View view){
        Intent i = new Intent(this,Samc.class);
        startActivity(i);
    }
    public void samg3(View view){
        Intent i = new Intent(this,Samsi.class);
        startActivity(i);
    }
    public void samg4(View view){
        Intent i = new Intent(this,Samsu.class);
        startActivity(i);
    }
    public void samg5(View view){
        Intent i = new Intent(this,Samcar.class);
        startActivity(i);
    }
}
