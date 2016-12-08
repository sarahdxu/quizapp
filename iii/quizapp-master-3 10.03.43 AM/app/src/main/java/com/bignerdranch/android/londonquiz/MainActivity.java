package com.bignerdranch.android.londonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button mTrueButton1;
    private Button mFalseButton1;
    private Button mTrueButton2;
    private Button mFalseButton2;
    private Button mTrueButton3;
    private Button mFalseButton3;
    private Button mTrueButton4;
    private Button mFalseButton4;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton1 = (Button) findViewById(R.id.true_button1);
        mTrueButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton1.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton1.setEnabled(false);
                mFalseButton1.setEnabled(false);
            }
        });
        mFalseButton1 = (Button) findViewById(R.id.false_button1);
        mFalseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton1.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton1.setEnabled(false);
                mTrueButton1.setEnabled(false);
            }
        });

        mTrueButton2 = (Button) findViewById(R.id.true_button2);
        mTrueButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton2.setTextColor(getResources().getColor(R.color.RED));
                mTrueButton2.setEnabled(false);
                mFalseButton2.setEnabled(false);
            }
        });

        mFalseButton2 = (Button) findViewById(R.id.false_button2);
        mFalseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton2.setTextColor(getResources().getColor(R.color.GREEN));
                mFalseButton2.setEnabled(false);
                mTrueButton2.setEnabled(false);
            }
        });

        mTrueButton3 = (Button) findViewById(R.id.true_button3);
        mTrueButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton3.setTextColor(getResources().getColor(R.color.RED));
                mTrueButton3.setEnabled(false);
                mFalseButton3.setEnabled(false);
            }
        });

        mFalseButton3 = (Button) findViewById(R.id.false_button3);
        mFalseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton3.setTextColor(getResources().getColor(R.color.GREEN));
                mFalseButton3.setEnabled(false);
                mTrueButton3.setEnabled(false);
            }
        });

        mTrueButton4 = (Button) findViewById(R.id.true_button4);
        mTrueButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton4.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton4.setEnabled(false);
                mFalseButton4.setEnabled(false);
            }
        });

        mFalseButton4 = (Button) findViewById(R.id.false_button4);
        mFalseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton4.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton4.setEnabled(false);
                mTrueButton4.setEnabled(false);
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
