package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Micacar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micacar);
    }
    public void opaplmi(View view)
    {
        Intent i = new Intent(this,Microsoft.class);
        startActivity(i);
    }
    public void papoppmi(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bromiww(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.microsoft.com/"));
        startActivity(i);
    }
}
