package com.bignerdranch.android.londonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class Main4Activity extends AppCompatActivity {

    private Button mTrueButton13;
    private Button mFalseButton13;
    private Button mTrueButton14;
    private Button mFalseButton14;
    private Button mTrueButton15;
    private Button mFalseButton15;
    private Button mTrueButton16;
    private Button mFalseButton16;
    private Button mCheatButton13;
    private Button mCheatButton14;
    private Button mCheatButton15;
    private Button mCheatButton16;
    private Button mSkipButton13;
    private Button mSkipButton14;
    private Button mSkipButton15;
    private Button mSkipButton16;
    int score4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mTrueButton13 = (Button) findViewById(R.id.true_button13);
        mTrueButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton13.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton13.setEnabled(false);
                mFalseButton13.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mSkipButton13.setEnabled(false);
                score4++;
                display(score4);
            }
        });

        mFalseButton13 = (Button) findViewById(R.id.false_button13);
        mFalseButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton13.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton13.setEnabled(false);
                mTrueButton13.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mSkipButton13.setEnabled(false);
                score4=score4-1;
                display(score4);
            }
        });

        mCheatButton13 = (Button) findViewById(R.id.cheat_13);
        mCheatButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton13.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton13.setEnabled(false);
                mFalseButton13.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mSkipButton13.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mCheatButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });
        mSkipButton13 = (Button) findViewById(R.id.skip_13);
        mSkipButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton13.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton13.setEnabled(false);
                mFalseButton13.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mSkipButton13.setEnabled(false);
                mSkipButton14.setEnabled(false);
                mSkipButton15.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });

        mFalseButton14 = (Button) findViewById(R.id.false_button14);
        mFalseButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton14.setTextColor(getResources().getColor(R.color.GREEN));
                mFalseButton14.setEnabled(false);
                mTrueButton14.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mSkipButton14.setEnabled(false);
                score4++;
                display(score4);
            }
        });

        mTrueButton14 = (Button) findViewById(R.id.true_button14);
        mTrueButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton14.setTextColor(getResources().getColor(R.color.RED));
                mTrueButton14.setEnabled(false);
                mFalseButton14.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mSkipButton14.setEnabled(false);
                score4=score4-1;
                display(score4);
            }
        });

        mCheatButton14 = (Button) findViewById(R.id.cheat_14);
        mCheatButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton14.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton14.setEnabled(false);
                mFalseButton14.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mSkipButton14.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mCheatButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });
        mSkipButton14 = (Button) findViewById(R.id.skip_14);
        mSkipButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton14.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton14.setEnabled(false);
                mFalseButton14.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mSkipButton13.setEnabled(false);
                mSkipButton14.setEnabled(false);
                mSkipButton15.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });

        mTrueButton15 = (Button) findViewById(R.id.true_button15);
        mTrueButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton15.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton15.setEnabled(false);
                mFalseButton15.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mSkipButton15.setEnabled(false);
                score4++;
                display(score4);
            }
        });

        mFalseButton15 = (Button) findViewById(R.id.false_button15);
        mFalseButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton15.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton15.setEnabled(false);
                mTrueButton15.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mSkipButton15.setEnabled(false);
                score4=score4-1;
                display(score4);
            }
        });

        mCheatButton15 = (Button) findViewById(R.id.cheat_15);
        mCheatButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton15.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton15.setEnabled(false);
                mFalseButton15.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mSkipButton15.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mCheatButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });

        mSkipButton15 = (Button) findViewById(R.id.skip_15);
        mSkipButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton15.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton15.setEnabled(false);
                mFalseButton15.setEnabled(false);
                mCheatButton15.setEnabled(false);
                mSkipButton13.setEnabled(false);
                mSkipButton14.setEnabled(false);
                mSkipButton15.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });

        mTrueButton16 = (Button) findViewById(R.id.true_button16);
        mTrueButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton16.setTextColor(getResources().getColor(R.color.GREEN));
                mTrueButton16.setEnabled(false);
                mFalseButton16.setEnabled(false);
                mCheatButton16.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4++;
                display(score4);
            }
        });

        mFalseButton16 = (Button) findViewById(R.id.false_button16);
        mFalseButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton16.setTextColor(getResources().getColor(R.color.RED));
                mFalseButton16.setEnabled(false);
                mTrueButton16.setEnabled(false);
                mCheatButton16.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4=score4-1;
                display(score4);
            }
        });

        mCheatButton16 = (Button) findViewById(R.id.cheat_16);
        mCheatButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton16.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton16.setEnabled(false);
                mFalseButton16.setEnabled(false);
                mCheatButton16.setEnabled(false);
                mSkipButton16.setEnabled(false);
                mCheatButton13.setEnabled(false);
                mCheatButton14.setEnabled(false);
                mCheatButton15.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });
        mSkipButton16 = (Button) findViewById(R.id.skip_16);
        mSkipButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton16.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton16.setEnabled(false);
                mFalseButton16.setEnabled(false);
                mCheatButton16.setEnabled(false);
                mSkipButton13.setEnabled(false);
                mSkipButton14.setEnabled(false);
                mSkipButton15.setEnabled(false);
                mSkipButton16.setEnabled(false);
                score4=score4+0;
                display(score4);
            }
        });


    }
    private void display(int score) {
        TextView scoreView=(TextView) findViewById(R.id.score4);
        scoreView.setText(String.valueOf("Your score: "+score4));
    }
}
