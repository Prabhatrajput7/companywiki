package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Microsoft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);
    }
    public void micro(View view)
    {
        Intent i = new Intent(this,Mica.class);
        startActivity(i);
    }
    public void micro1(View view){
        Intent i = new Intent(this,Micac.class);
        startActivity(i);
    }
    public void micro2(View view){
        Intent i = new Intent(this,Micasi.class);
        startActivity(i);
    }
    public void micro3(View view){
        Intent i = new Intent(this,Micasu.class);
        startActivity(i);
    }
    public void micro4(View view){
        Intent i = new Intent(this,Micacar.class);
        startActivity(i);
    }
}
