package com.bignerdranch.android.londonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    private Button mTrueButton5;
    private Button mFalseButton5;
    private Button mTrueButton6;
    private Button mFalseButton6;
    private Button mTrueButton7;
    private Button mFalseButton7;
    private Button mTrueButton8;
    private Button mFalseButton8;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTrueButton5 = (Button) findViewById(R.id.true_button5);
        mTrueButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton5.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton5.setEnabled(false);
                mFalseButton5.setEnabled(false);
            }
        });

        mFalseButton5 = (Button) findViewById(R.id.false_button5);
        mFalseButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton5.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton5.setEnabled(false);
                mTrueButton5.setEnabled(false);
            }
        });

        mTrueButton6 = (Button) findViewById(R.id.true_button6);
        mTrueButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton6.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton6.setEnabled(false);
                mFalseButton6.setEnabled(false);
            }
        });

        mFalseButton6 = (Button) findViewById(R.id.false_button6);
        mFalseButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton6.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton6.setEnabled(false);
                mTrueButton6.setEnabled(false);
            }
        });

        mTrueButton7 = (Button) findViewById(R.id.true_button7);
        mTrueButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton7.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton7.setEnabled(false);
                mFalseButton7.setEnabled(false);
            }
        });

        mFalseButton7 = (Button) findViewById(R.id.false_button7);
        mFalseButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton7.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton7.setEnabled(false);
                mTrueButton7.setEnabled(false);
            }
        });

        mTrueButton8 = (Button) findViewById(R.id.true_button8);
        mTrueButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton8.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton8.setEnabled(false);
                mFalseButton8.setEnabled(false);
            }
        });

        mFalseButton8 = (Button) findViewById(R.id.false_button8);
        mFalseButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton8.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton8.setEnabled(false);
                mTrueButton8.setEnabled(false);
      
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
