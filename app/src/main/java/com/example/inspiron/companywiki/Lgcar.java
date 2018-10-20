package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lgcar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgcar);
    }
    public void opapllg(View view)
    {
        Intent i = new Intent(this,Moto.class);
        startActivity(i);
    }
    public void papopplg(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bropwlg(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lg.com/in/about-lg/career"));
        startActivity(i);
    }
}
