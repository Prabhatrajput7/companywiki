package com.example.inspiron.companywiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.de)
        {
            Intent i=new Intent(this,Menuone.class);
            startActivity(i);
        }
        else if(id==R.id.ad)
        {
            Intent j=new Intent(this,Menutwo.class);
            startActivity(j);
        }
        else
        {
            finish();
            Toast.makeText(this,"You have selected exit ",Toast.LENGTH_LONG).show();
        }

        return true;
    }

    public void abh(View view) {
        Intent i=new Intent(this,Google.class);
        startActivity(i);
    }

    public void dbh(View view) {
        Intent i=new Intent(this,Apple.class);
        startActivity(i);
    }


    public void gju(View view) {
        Intent i=new Intent(this,Moto.class);
        startActivity(i);
    }


    public void idiot(View view) {
        Intent i=new Intent(this,Sony.class);
        startActivity(i);
    }

    public void udtaa(View view) {
        Intent i=new Intent(this,Samsung.class);
        startActivity(i);
    }

    public void ra(View view) {
        Intent i=new Intent(this,Microsoft.class);
        startActivity(i);
    }

    public void ok(View view) {
        Intent i=new Intent(this,Htc.class);
        startActivity(i);
    }
}
