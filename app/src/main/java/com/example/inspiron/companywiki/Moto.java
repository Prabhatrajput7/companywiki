package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Moto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);
    }
    public void lg1(View view)
    {
        Intent i = new Intent(this,Lga.class);
        startActivity(i);
    }
    public void lg2(View view){
        Intent i = new Intent(this,Lgc.class);
        startActivity(i);
    }
    public void lg3(View view){
        Intent i = new Intent(this,Lgsi.class);
        startActivity(i);
    }
    public void lg4(View view){
        Intent i = new Intent(this,Lgsignup.class);
        startActivity(i);
    }
    public void lg5(View view){
        Intent i = new Intent(this,Lgcar.class);
        startActivity(i);
    }
}
