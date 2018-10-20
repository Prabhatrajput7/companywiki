package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mica);
    }
    public void opomi(View view)
    {
        Intent i = new Intent(this,Microsoft.class);
        startActivity(i);
    }
    public void opomicc(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
