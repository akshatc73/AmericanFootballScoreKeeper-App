package com.example.student.americanfootballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoresTeamA = 0, scoresTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //id TA is Touchdown button of A team,similary short initials are used for each subsequent button of both teams A&B respectively


public void scoreUpdateA(int score){
        TextView scoreViewA =(TextView)findViewById(R.id.score_text_viewA);
        scoreViewA.setText(String.valueOf(score));
}
public void scoreUpdateB(int score){
        TextView scoreViewB =(TextView)findViewById(R.id.score_text_viewB);
        scoreViewB.setText(String.valueOf(score));
}
public void clickA(View view){
    switch (view.getId()){
        case R.id.ta:
            scoresTeamA = scoresTeamA+6;
            scoreUpdateA(scoresTeamA);
            break;
        case R.id.fa:
            scoresTeamA = scoresTeamA+3;
            scoreUpdateA(scoresTeamA);
            break;
        case R.id.ea:
            scoresTeamA = scoresTeamA+1;
            scoreUpdateA(scoresTeamA);
            break;
        case R.id.sa:
            scoresTeamA = scoresTeamA+2;
            scoreUpdateA(scoresTeamA);
            break;
        case R.id.resetBtn:
            scoreUpdateA(0);
            scoreUpdateB(0);

    }
}
    public void clickB(View view){
        switch (view.getId()){
            case R.id.TB:
                scoresTeamB = scoresTeamB+6;
                scoreUpdateB(scoresTeamB);
                break;
            case R.id.FB:
                scoresTeamB = scoresTeamB+3;
                scoreUpdateB(scoresTeamB);
                break;
            case R.id.EB:
                scoresTeamB = scoresTeamB+1;
                scoreUpdateB(scoresTeamB);
                break;
            case R.id.SB:
                scoresTeamB = scoresTeamB+2;
                scoreUpdateB(scoresTeamB);
                break;
            case R.id.resetBtn:
                scoreUpdateA(0);
                scoreUpdateB(0);

        }
    }


    }


