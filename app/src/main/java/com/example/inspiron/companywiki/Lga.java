package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lga);
    }
    public void opolg(View view)
    {
        Intent i = new Intent(this,Moto.class);
        startActivity(i);
    }
    public void opoplg(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
