package com.example.sab.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class fblogin extends AppCompatActivity {
    Toolbar toolbar;
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fblogin);
        toolbar=(Toolbar)findViewById(R.id.fbtoolbar);
        toolbar.setTitle("Facebook");
        setSupportActionBar(toolbar);
        button1=(Button)findViewById(R.id.btnca);
        button2=(Button)findViewById(R.id.btnnn);
        button3=(Button)findViewById(R.id.loginbtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fblogin.this,CreateAccount.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fblogin.this,PermissionScreen.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fblogin.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
