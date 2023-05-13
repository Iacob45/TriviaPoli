package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class HistoryTriviaActivity extends AppCompatActivity {

    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"Which country did Hitler invade on the 1st of September 1939?","Austria","The Netherlands","Poland","France",
            "Approximately 4,000 years ago, Nomads created ice skates out of what material?","Remnants Of Shipwrecks","Bones","Driftwood","Pig Skin",
            "How many Celtic languages are still spoken today?","6","0","3","5",
            "Where did Albert Einstein live before moving to the United States?", "The United Kingdom","France","Russia","Germany"};
    private Integer answers[] = {3,2,1,4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_trivia);


        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionH);
        TextAnswer1 = findViewById(R.id.textRaspunsH1);
        TextAnswer2 = findViewById(R.id.textRaspunsH2);
        TextAnswer3 = findViewById(R.id.textRaspunsH3);
        TextAnswer4 = findViewById(R.id.textRaspunsH4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }




    public void launchContorHK1(View view) {
        k=1;
        verifyFunctionH();
    }

    public void launchContorHK2(View view) {
        k=2;
        verifyFunctionH();
    }

    public void launchContorHK3(View view) {
        k=3;
        verifyFunctionH();
    }

    public void launchContorHK4(View view) {
        k=4;
        verifyFunctionH();
    }

    public void verifyFunctionH() {
        if(answers[x] == k)
        {
            Intent intent1 = new Intent(this, CongratsActivity.class);
            startActivity(intent1);
        }
        else
        {
            Intent intent2 = new Intent(this, WrongActivity.class);
            startActivity(intent2);
        }
    }

    public void launchMainActivity(View view)
    {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }

    public void launchSelectionActivity(View view)
    {
        Intent intent4 = new Intent(this, SelectionActivity.class);
        startActivity(intent4);
    }
}