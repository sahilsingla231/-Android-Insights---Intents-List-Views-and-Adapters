package com.example.sahil.newlogin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("Registered")
public class Register extends AppCompatActivity {
     TextView regText;
     EditText user,pass,phone;
     Button submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.register_main);

        regText=(TextView)findViewById(R.id.textView3);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        phone=(EditText)findViewById(R.id.phone);
        submit=(Button) findViewById(R.id.register);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent i=new Intent(Register.this,MainActivity.class);
               startActivity(i);
           }
       });
    }
}
