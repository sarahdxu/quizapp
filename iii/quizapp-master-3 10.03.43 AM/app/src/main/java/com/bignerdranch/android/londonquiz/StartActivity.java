package com.bignerdranch.android.londonquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private Button mStartButton;
    Button mButton;
    EditText mEdit;
    TextView mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mButton = (Button)findViewById(R.id.submit);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = (EditText)findViewById(R.id.editText1);
                mText = (TextView)findViewById(R.id.textView1);
                mText.setText("Welcome "+mEdit.getText().toString()+"!");
            }
        });


        mStartButton = (Button) findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
