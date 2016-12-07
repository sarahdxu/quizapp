package com.bignerdranch.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity2 extends AppCompatActivity {

    private Button mTrueButton1;
    private Button mFalseButton1;
    private Button mTrueButton2;
    private Button mFalseButton2;
    private Button mTrueButton3;
    private Button mFalseButton3;
    private Button mTrueButton4;
    private Button mFalseButton4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton1 = (Button) findViewById(R.id.true_button1);
        mTrueButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton1 = (Button) findViewById(R.id.false_button1);
        mFalseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });


        mTrueButton2 = (Button) findViewById(R.id.true_button2);
        mTrueButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton2 = (Button) findViewById(R.id.false_button2);
        mFalseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mTrueButton3 = (Button) findViewById(R.id.true_button3);
        mTrueButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton3 = (Button) findViewById(R.id.false_button3);
        mFalseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mTrueButton4 = (Button) findViewById(R.id.true_button4);
        mTrueButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton4 = (Button) findViewById(R.id.false_button4);
        mFalseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity2.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}

