package com.bignerdranch.android.londonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {

    private Button mTrueButton9;
    private Button mFalseButton9;
    private Button mTrueButton10;
    private Button mFalseButton10;
    private Button mTrueButton11;
    private Button mFalseButton11;
    private Button mTrueButton12;
    private Button mFalseButton12;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTrueButton9 = (Button) findViewById(R.id.true_button9);
        mTrueButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton9.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton9.setEnabled(false);
                mFalseButton9.setEnabled(false);
            }
        });

        mFalseButton9 = (Button) findViewById(R.id.false_button9);
        mFalseButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton9.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton9.setEnabled(false);
                mTrueButton9.setEnabled(false);
            }
        });

        mTrueButton10 = (Button) findViewById(R.id.true_button10);
        mTrueButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton10.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton10.setEnabled(false);
                mFalseButton10.setEnabled(false);
            }
        });

        mFalseButton10 = (Button) findViewById(R.id.false_button10);
        mFalseButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton10.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton10.setEnabled(false);
                mTrueButton10.setEnabled(false);
            }
        });

        mTrueButton11 = (Button) findViewById(R.id.true_button11);
        mTrueButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton11.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton11.setEnabled(false);
                mFalseButton11.setEnabled(false);
            }
        });

        mFalseButton11 = (Button) findViewById(R.id.false_button11);
        mFalseButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton11.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton11.setEnabled(false);
                mTrueButton11.setEnabled(false);
            }
        });

        mTrueButton12 = (Button) findViewById(R.id.true_button12);
        mTrueButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton12.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton12.setEnabled(false);
                mFalseButton12.setEnabled(false);
            }
        });

        mFalseButton12 = (Button) findViewById(R.id.false_button12);
        mFalseButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton12.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton12.setEnabled(false);
                mTrueButton12.setEnabled(false);
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

    }
}


