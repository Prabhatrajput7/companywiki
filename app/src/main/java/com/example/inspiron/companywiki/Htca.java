package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Htca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htca);
    }
    public void ohhh(View view)
    {
        Intent i = new Intent(this,Htc.class);
        startActivity(i);
    }
    public void opohp(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
