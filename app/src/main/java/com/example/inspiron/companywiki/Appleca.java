package com.example.inspiron.companywiki;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Appleca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appleca);
    }
    public void opaplp(View view)
    {
        Intent i = new Intent(this,Apple.class);
        startActivity(i);
    }
    public void papoppp(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bropww(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/jobs/us/"));
        startActivity(i);
    }
}
