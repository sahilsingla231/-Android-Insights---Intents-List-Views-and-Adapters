package com.example.sahil.newlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button login;
    private Button reset;
    private TextView register;
    private TextView username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.login);
        reset=(Button)findViewById(R.id.reset);
        register=(TextView)findViewById(R.id.register);
        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);

         login.setOnClickListener(this);
         reset.setOnClickListener(this);
         register.setOnClickListener(this);

    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.login :
                String Username=username.getText().toString();
                String Password=password.getText().toString();
                if(Username.equalsIgnoreCase("abc")&&Password.equals("xyz")){
                    Intent i=new Intent(MainActivity.this,loginform.class);
                    i.putExtra("username",Username);
                    startActivity(i);
                }else{
                    Toast.makeText(this,"Incorrect Login details!",Toast.LENGTH_LONG).show();
                }
           break;

            case R.id.reset :
                username.setText("");
                password.setText("");

                break;

            case R.id.register :
                Toast.makeText(this,"You are being redirected to registeration page!",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,Register.class);
                startActivity(i);
                break;
        }
    }

}
