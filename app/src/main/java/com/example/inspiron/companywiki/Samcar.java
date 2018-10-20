package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Samcar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samcar);
    }
    public void opaplsa(View view)
    {
        Intent i = new Intent(this,Samsung.class);
        startActivity(i);
    }
    public void papoppsa(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bropwsa(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.samsung.com/us/careers/"));
        startActivity(i);
    }
}
