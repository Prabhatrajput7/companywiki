package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Htcsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htcsi);
    }
    public void jhh(View view)
    {
        Intent i = new Intent(this,Htc.class);
        startActivity(i);
    }
    public void mhh(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void hhhhbf(View view){
        Toast.makeText(this,"SignIn Done Successfully ",Toast.LENGTH_LONG).show();
    }
}
