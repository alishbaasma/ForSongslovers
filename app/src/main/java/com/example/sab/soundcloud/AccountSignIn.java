package com.example.sab.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountSignIn extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_sign_in);
        button1=(Button)findViewById(R.id.signin);
        button2=(Button)findViewById(R.id.ca);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AccountSignIn.this,SignIn.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(AccountSignIn.this,CreateAccount.class);
                startActivity(i);
            }
        }));
    }
}
