package com.example.augmantedreality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button logIn,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn = findViewById(R.id.mainLogIn);
        signUp = findViewById(R.id.mainSignUp);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast toast = Toast.makeText(MainActivity.this, R.string.welcome, Toast.LENGTH_LONG);
                //View view = toast.getView();
                //view.setBackgroundResource(R.drawable.background);
                //TextView text = (TextView) view.findViewById(android.R.id.message);
               // text.setTextColor( Color.parseColor("FCF8F8"));
                /*Here you can do anything with above textview like text.setTextColor(Color.parseColor("#000000"));*/
                //toast.show();
                startActivity(new Intent(MainActivity.this,BasementActivity.class));
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });

    }
}
