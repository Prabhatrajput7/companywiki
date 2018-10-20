package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sony extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony);
    }
    public void sony1(View view)
    {
        Intent i = new Intent(this,Sonya.class);
        startActivity(i);
    }
    public void sony2(View view){
        Intent i = new Intent(this,Sonyc.class);
        startActivity(i);
    }
    public void sony3(View view){
        Intent i = new Intent(this,Sonysi.class);
        startActivity(i);
    }
    public void sony4(View view){
        Intent i = new Intent(this,Sonysu.class);
        startActivity(i);
    }
    public void sony5(View view){
        Intent i = new Intent(this,Sonycar.class);
        startActivity(i);
    }
}
