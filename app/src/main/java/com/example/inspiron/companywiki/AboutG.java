package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_g);
    }
    public void opop(View view)
    {
    Intent i = new Intent(this,Google.class);
    startActivity(i);
    }
    public void opopp(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}