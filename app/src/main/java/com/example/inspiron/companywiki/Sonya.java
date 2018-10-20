package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sonya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonya);
    }
    public void oposony(View view)
    {
        Intent i = new Intent(this,Sony.class);
        startActivity(i);
    }
    public void opopsony(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
