package com.example.sab.soundcloud;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    private TextInputLayout textInputEmail;
    private  TextInputLayout textInputPassword;
    ImageButton imageButton1;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        textInputEmail=findViewById(R.id.text_input_email);
        textInputPassword=findViewById(R.id.text_input_password);
        imageButton1=(ImageButton)findViewById(R.id.googlebtn);
        imageButton2=(ImageButton)findViewById(R.id.facebookbtn);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this,"Continue with Google",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SignIn.this,googleSignIn.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this,"Continue with Facebook",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SignIn.this,fblogin.class);
                startActivity(intent);
            }
        });
    }

    private boolean validateEmail(){
        String emailInput=textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()){
            textInputEmail.setError("Field cant be empty");
            return false;
        }
        else {
            textInputEmail.setError(null);
            return true;
        }
    }
    private boolean validatePassword(){
        String passwordInput=textInputPassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()){
            textInputPassword.setError("Field cant be empty");
            return false;
        }
        else {
            textInputPassword.setError(null);
            return true;
        }
    }
    public void confirmInput(View v){
        if (!validateEmail()|!validatePassword()){
            return;
        }
        String input="Email:" + textInputEmail.getEditText().getText().toString();
        input+="\n";
        input+="Password" +textInputPassword.getEditText().getText().toString();

        Toast.makeText(this,input,Toast.LENGTH_SHORT).show();
    }
}
