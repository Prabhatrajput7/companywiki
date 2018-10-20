package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Htcca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htcca);
    }
    public void opaplhtc(View view)
    {
        Intent i = new Intent(this,Htc.class);
        startActivity(i);
    }
    public void papohtc(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void brophtc(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.htc.com/"));
        startActivity(i);
    }
}
