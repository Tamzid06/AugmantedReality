package com.example.augmantedreality;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1Activity extends AppCompatActivity {

    RadioButton ans[];
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        ans = new RadioButton[5];
        ans[0] = (RadioButton) findViewById(R.id.c1q1o1);
        ans[1] = (RadioButton) findViewById(R.id.c1q2o2);
        ans[2] = (RadioButton) findViewById(R.id.c1q3o1);
        ans[3] = (RadioButton) findViewById(R.id.c1q4o3);
        ans[4] = (RadioButton) findViewById(R.id.c1q5o1);
        submit = findViewById(R.id.quiz1Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer marks = 0;
                for(int i=0;i<5;i++)
                {
                    if(ans[i].isChecked())
                        marks++;
                }
                Toast post;
                if(marks<2)
                {
                    post = Toast.makeText(getBaseContext(), "Your obtained score is "   + marks.toString() + "", Toast.LENGTH_LONG);
                    TextView toastMessage = (TextView) post.getView().findViewById(android.R.id.message);
                    toastMessage.setTextColor(Color.RED);

                }
                else
                {
                    post = Toast.makeText(getBaseContext(), "Your obtained score is "   + marks.toString() + "", Toast.LENGTH_LONG);
                    TextView toastMessage = (TextView) post.getView().findViewById(android.R.id.message);
                    toastMessage.setTextColor(Color.GREEN);

                }
                post.show();
                finish();
            }
        });

    }
}
