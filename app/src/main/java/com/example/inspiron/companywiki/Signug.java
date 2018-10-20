package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Signug extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signug);
    }
    public void llll(View view)
    {
        Intent i = new Intent(this,Google.class);
        startActivity(i);
    }
    public void kkkk(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bfaaa(View view){
        Toast.makeText(this,"SignUp Done Successfully ",Toast.LENGTH_LONG).show();
    }
}
