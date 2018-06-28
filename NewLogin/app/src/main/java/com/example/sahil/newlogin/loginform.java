package com.example.sahil.newlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class loginform extends AppCompatActivity {
    private TextView textLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_main);
        Intent i=getIntent();
        String userName=i.getStringExtra("username");
         textLogin=(TextView)findViewById(R.id.textView2);
         textLogin.setText(textLogin.getText()+" "+userName+".");
    }
}
