package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Lgsignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgsignup);
    }
    public void llllg(View view)
    {
        Intent i = new Intent(this,Moto.class);
        startActivity(i);
    }
    public void kkklg(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void bfaalg(View view){
        Toast.makeText(this,"SignUp Done Successfully ",Toast.LENGTH_LONG).show();
    }
}
