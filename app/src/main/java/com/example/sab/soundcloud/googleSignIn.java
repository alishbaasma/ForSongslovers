package com.example.sab.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class googleSignIn extends AppCompatActivity {
    Toolbar toolbar;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_sign_in);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("alishba zafar");
        toolbar.setSubtitle("aleenazafar123@gmail.com");
        setSupportActionBar(toolbar);
        button1=(Button)findViewById(R.id.allowbtn);
        button2=(Button)findViewById(R.id.denybtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(googleSignIn.this,Home.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(googleSignIn.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}
