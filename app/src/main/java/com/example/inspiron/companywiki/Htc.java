package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Htc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htc);
    }
    public void htc12(View view)
    {
        Intent i = new Intent(this,Htca.class);
        startActivity(i);
    }
    public void htc13(View view){
        Intent i = new Intent(this,Htcc.class);
        startActivity(i);
    }
    public void htc15(View view){
        Intent i = new Intent(this,Htcsi.class);
        startActivity(i);
    }
    public void htc16(View view){
        Intent i = new Intent(this,Htcsu.class);
        startActivity(i);
    }
    public void htc19(View view){
        Intent i = new Intent(this,Htcca.class);
        startActivity(i);
    }
}
