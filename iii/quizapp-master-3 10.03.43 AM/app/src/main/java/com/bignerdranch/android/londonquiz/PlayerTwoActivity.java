package com.bignerdranch.android.londonquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerTwoActivity extends AppCompatActivity {

    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_two);

        mNextButton = (Button) findViewById(R.id.start_button);
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerTwoActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
