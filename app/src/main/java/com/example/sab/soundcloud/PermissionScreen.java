package com.example.sab.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PermissionScreen extends AppCompatActivity {
    Toolbar toolbar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_screen);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Application Permissions");
        setSupportActionBar(toolbar);

        button=(Button)findViewById(R.id.btnLocationPage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PermissionScreen.this,AccountSignIn.class);
                startActivity(intent);
            }
        });
    }
}
