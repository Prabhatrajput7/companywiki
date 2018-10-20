package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
    }
    public void zzza(View view)
    {
        Intent i = new Intent(this,Appleau.class);
        startActivity(i);
    }
    public void zzzaa(View view){
        Intent i = new Intent(this,Applec.class);
        startActivity(i);
    }
    public void zzzaaa(View view){
        Intent i = new Intent(this,Applesi.class);
        startActivity(i);
    }
    public void zzzaaaa(View view){
        Intent i = new Intent(this,Applesu.class);
        startActivity(i);
    }
    public void zzzaaaaa(View view){
        Intent i = new Intent(this,Appleca.class);
        startActivity(i);
    }
}
