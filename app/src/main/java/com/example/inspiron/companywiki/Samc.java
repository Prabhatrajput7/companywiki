package com.example.inspiron.companywiki;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Samc extends AppCompatActivity {
    Button sam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samc);
        Button startBtn = (Button) findViewById(R.id.button41);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });
        sam = (Button) findViewById(R.id.button42);
        sam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01122229898"));
                if (ActivityCompat.checkSelfPermission(Samc.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(callIntent);
            }
        });
    }
    public void samgg(View view) {
        Intent i = new Intent(this, Samsung.class);
        startActivity(i);
    }
    public void locsamg(View view){
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:28.460772, 77.048490"));
        Intent chooser=Intent.createChooser(i,"Launch Maps");
        startActivity(chooser);

    }

    public void samggg(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    protected void sendEmail(){
        Log.i("send email","");
        String[] TO = {"support.samsung+++@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        try{
            startActivity(Intent.createChooser(emailIntent, "send mail..."));
            finish();
            Log.i("Finish Sending email", "");
        }
        catch (android.content.ActivityNotFoundException ex){

        }

    }
}
