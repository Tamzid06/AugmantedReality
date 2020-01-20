package com.example.augmantedreality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Transition extends AppCompatActivity {

    //FirebaseDatabase.getInstance().getReference().child("Store").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("username").setValue("SIR");
    Button aRButton,showModelButton;
    private FirebaseDatabase mFirebaseDatabase;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myRef;
    private String userId;

    TextView quiz,ch1,ch2,ch3,ch4,ch5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        load();
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transition.this, Quiz1Activity.class));
            }
        });

        aRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.fahim.ArD");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });
        showModelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transition.this,ShowModelActivity.class));
            }
        });
    }

    private void load() {
        aRButton = findViewById(R.id.transitionARButton);
        showModelButton = findViewById(R.id.transitionShowModelButton);
        ch1 = findViewById(R.id.chapter1);
        ch2 = findViewById(R.id.chapter2);
        ch3 = findViewById(R.id.chapter3);
        ch4 = findViewById(R.id.chapter4);
        ch5 = findViewById(R.id.chapter5);
    }
}
