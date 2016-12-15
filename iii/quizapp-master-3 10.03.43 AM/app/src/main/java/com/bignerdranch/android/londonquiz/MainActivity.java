package com.bignerdranch.android.londonquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;

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
    private Button mCheatButton1;
    private Button mCheatButton2;
    private Button mCheatButton3;
    private Button mCheatButton4;
    private Button mSkipButton1;
    private Button mSkipButton2;
    private Button mSkipButton3;
    private Button mSkipButton4;
    int score = 0;

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
                mCheatButton1.setEnabled(false);
                mSkipButton1.setEnabled(false);
                score++;
                display(score);
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
                mCheatButton1.setEnabled(false);
                mSkipButton1.setEnabled(false);
                score=score-1;
                display(score);
            }
        });

        mCheatButton1 = (Button) findViewById(R.id.cheat_1);
        mCheatButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton1.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton1.setEnabled(false);
                mFalseButton1.setEnabled(false);
                mCheatButton1.setEnabled(false);
                mCheatButton2.setEnabled(false);
                mCheatButton3.setEnabled(false);
                mCheatButton4.setEnabled(false);
                mSkipButton1.setEnabled(false);
                score=score+0;
                display(score);
            }
        });
        mSkipButton1 = (Button) findViewById(R.id.skip_1);
        mSkipButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton1.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton1.setEnabled(false);
                mFalseButton1.setEnabled(false);
                mCheatButton1.setEnabled(false);
                mSkipButton1.setEnabled(false);
                mSkipButton2.setEnabled(false);
                mSkipButton3.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score=score+0;
                display(score);
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
                mCheatButton2.setEnabled(false);
                mSkipButton2.setEnabled(false);
                score=score-1;
                display(score);
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
                mCheatButton2.setEnabled(false);
                mSkipButton2.setEnabled(false);
                score++;
                display(score);
            }
        });
        mCheatButton2 = (Button) findViewById(R.id.cheat_2);
        mCheatButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton2.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton2.setEnabled(false);
                mFalseButton2.setEnabled(false);
                mCheatButton1.setEnabled(false);
                mCheatButton2.setEnabled(false);
                mCheatButton3.setEnabled(false);
                mCheatButton4.setEnabled(false);
                mSkipButton2.setEnabled(false);
                score=score+0;
                display(score);
            }
        });

        mSkipButton2 = (Button) findViewById(R.id.skip_2);
        mSkipButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton2.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton2.setEnabled(false);
                mFalseButton2.setEnabled(false);
                mCheatButton2.setEnabled(false);
                mSkipButton2.setEnabled(false);
                mSkipButton1.setEnabled(false);
                mSkipButton3.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score=score+0;
                display(score);
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
                mCheatButton3.setEnabled(false);
                mSkipButton3.setEnabled(false);
                score=score-1;
                display(score);
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
                mCheatButton3.setEnabled(false);
                mSkipButton3.setEnabled(false);
                score++;
                display(score);
            }
        });
        mCheatButton3 = (Button) findViewById(R.id.cheat_3);
        mCheatButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mFalseButton3.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton3.setEnabled(false);
                mFalseButton3.setEnabled(false);
                mCheatButton1.setEnabled(false);
                mCheatButton2.setEnabled(false);
                mCheatButton3.setEnabled(false);
                mCheatButton4.setEnabled(false);
                mSkipButton3.setEnabled(false);
                score=score+0;
                display(score);
            }
        });
        mSkipButton3 = (Button) findViewById(R.id.skip_3);
        mSkipButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton3.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton3.setEnabled(false);
                mFalseButton3.setEnabled(false);
                mCheatButton3.setEnabled(false);
                mSkipButton1.setEnabled(false);
                mSkipButton2.setEnabled(false);
                mSkipButton3.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score=score+0;
                display(score);
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
                mCheatButton4.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score++;
                display(score);
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
                mCheatButton4.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score=score-1;
                display(score);
            }
        });

        mCheatButton4 = (Button) findViewById(R.id.cheat_4);
        mCheatButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.cheat_toast,
                        Toast.LENGTH_SHORT).show();
                mTrueButton4.setTextColor(getResources().getColor(R.color.PURPLE));
                mTrueButton4.setEnabled(false);
                mFalseButton4.setEnabled(false);
                mCheatButton4.setEnabled(false);
                mSkipButton4.setEnabled(false);
                mCheatButton3.setEnabled(false);
                mCheatButton2.setEnabled(false);
                mCheatButton1.setEnabled(false);
                score=score+0;
                display(score);
            }
        });

        mSkipButton4 = (Button) findViewById(R.id.skip_4);
        mSkipButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.skip_toast,
                        Toast.LENGTH_SHORT).show();
                mSkipButton4.setTextColor(getResources().getColor(R.color.YELLOW));
                mTrueButton4.setEnabled(false);
                mFalseButton4.setEnabled(false);
                mCheatButton4.setEnabled(false);
                mSkipButton1.setEnabled(false);
                mSkipButton2.setEnabled(false);
                mSkipButton3.setEnabled(false);
                mSkipButton4.setEnabled(false);
                score=score+0;
                display(score);
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayerTwoActivity.class);
                startActivity(intent);
            }
        });
    }
    private void display(int score) {
        TextView scoreView=(TextView) findViewById(R.id.score);
            scoreView.setText(String.valueOf("Your score: "+score));
    }
}
