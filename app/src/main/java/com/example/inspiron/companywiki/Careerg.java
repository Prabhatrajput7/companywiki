package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Careerg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careerg);
    }
    public void opoop(View view)
    {
        Intent i = new Intent(this,Google.class);
        startActivity(i);
    }
    public void opoppp(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void browww(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.google.com/"));
        startActivity(i);
    }
}
