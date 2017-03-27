package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayA(int number) {
        TextView teamATextView = (TextView) findViewById(R.id.teamA_text_view);
        teamATextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView teamATextView = (TextView) findViewById(R.id.teamB_text_view);
        teamATextView.setText("" + number);
    }


    public void add_1_A(View view) {
        scoreA++;
        displayA(scoreA);
    }
    public void add2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }
    public void add3A(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }
    public void add1B(View view) {
        scoreB++;
        displayB(scoreB);
    }
    public void add2B(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void add3B(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);

    }



}
