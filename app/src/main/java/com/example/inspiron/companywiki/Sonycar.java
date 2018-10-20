package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sonycar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonycar);
    }
    public void opapls(View view)
    {
        Intent i = new Intent(this,Sony.class);
        startActivity(i);
    }
    public void papopps(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bropws(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sonyjobs.com/"));
        startActivity(i);
    }
}
