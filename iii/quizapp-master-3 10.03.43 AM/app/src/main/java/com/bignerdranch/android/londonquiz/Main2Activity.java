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
    private Button mCheatButton5;
    private Button mCheatButton6;
    private Button mCheatButton7;
    private Button mCheatButton8;
    private Button mSkipButton5;
    private Button mSkipButton6;
    private Button mSkipButton7;
    private Button mSkipButton8;
    private Button mNextButton;
    int score2 = 0;

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
                mCheatButton5.setEnabled(false);
                mSkipButton5.setEnabled(false);
                score2++;
                display(score2);
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
                mCheatButton5.setEnabled(false);
                mSkipButton5.setEnabled(false);
                score2=score2-1;
                display(score2);
            }
        });

        mCheatButton5 = (Button) findViewById(R.id.cheat_5);
        mCheatButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton5.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton5.setEnabled(false);
                mFalseButton5.setEnabled(false);
                mCheatButton5.setEnabled(false);
                mCheatButton6.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mCheatButton8.setEnabled(false);
                mSkipButton5.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });
        mSkipButton5 = (Button) findViewById(R.id.skip_5);
        mSkipButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton5.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton5.setEnabled(false);
                mFalseButton5.setEnabled(false);
                mCheatButton5.setEnabled(false);
                mSkipButton5.setEnabled(false);
                mSkipButton6.setEnabled(false);
                mSkipButton7.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2+0;
                display(score2);
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
                mCheatButton6.setEnabled(false);
                mSkipButton6.setEnabled(false);
                score2++;
                display(score2);
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
                mCheatButton6.setEnabled(false);
                mSkipButton6.setEnabled(false);
                score2=score2-1;
                display(score2);
            }
        });

        mCheatButton6 = (Button) findViewById(R.id.cheat_6);
        mCheatButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton6.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton6.setEnabled(false);
                mFalseButton6.setEnabled(false);
                mCheatButton6.setEnabled(false);
                mCheatButton5.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mCheatButton8.setEnabled(false);
                mSkipButton6.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });
        mSkipButton6 = (Button) findViewById(R.id.skip_6);
        mSkipButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton6.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton6.setEnabled(false);
                mFalseButton6.setEnabled(false);
                mCheatButton6.setEnabled(false);
                mSkipButton5.setEnabled(false);
                mSkipButton6.setEnabled(false);
                mSkipButton7.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });

        mFalseButton7 = (Button) findViewById(R.id.false_button7);
        mFalseButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton7.setTextColor(getResources().getColor(R.color.GREEN));
                mFalseButton7.setEnabled(false);
                mTrueButton7.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mSkipButton7.setEnabled(false);
                score2++;
                display(score2);
            }
        });

        mTrueButton7 = (Button) findViewById(R.id.true_button7);
        mTrueButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton7.setTextColor(getResources().getColor(R.color.RED));
                mTrueButton7.setEnabled(false);
                mFalseButton7.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mSkipButton7.setEnabled(false);
                score2=score2-1;
                display(score2);
            }
        });

        mCheatButton7 = (Button) findViewById(R.id.cheat_7);
        mCheatButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton7.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton7.setEnabled(false);
                mFalseButton7.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mCheatButton8.setEnabled(false);
                mCheatButton6.setEnabled(false);
                mCheatButton5.setEnabled(false);
                mSkipButton7.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });

        mSkipButton7 = (Button) findViewById(R.id.skip_7);
        mSkipButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton7.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton7.setEnabled(false);
                mFalseButton7.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mSkipButton5.setEnabled(false);
                mSkipButton6.setEnabled(false);
                mSkipButton7.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2+0;
                display(score2);
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
                mCheatButton8.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2++;
                display(score2);
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
                mCheatButton8.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2-1;
                display(score2);
      
            }
        });

        mCheatButton8 = (Button) findViewById(R.id.cheat_8);
        mCheatButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton8.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton8.setEnabled(false);
                mFalseButton8.setEnabled(false);
                mCheatButton8.setEnabled(false);
                mCheatButton7.setEnabled(false);
                mCheatButton6.setEnabled(false);
                mCheatButton5.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });
        mSkipButton8 = (Button) findViewById(R.id.skip_8);
        mSkipButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton8.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton8.setEnabled(false);
                mFalseButton8.setEnabled(false);
                mCheatButton8.setEnabled(false);
                mSkipButton5.setEnabled(false);
                mSkipButton6.setEnabled(false);
                mSkipButton7.setEnabled(false);
                mSkipButton8.setEnabled(false);
                score2=score2+0;
                display(score2);
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, PlayerOneActivity.class);
                startActivity(intent);
            }
        });

    }
     private void display(int score) {
        TextView scoreView=(TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf("Your score: "+score2));
    }
}

