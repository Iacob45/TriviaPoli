package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GeographyTriviaActivity extends AppCompatActivity {


    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"On which continent is the Sahara Desert located?","Asia","South America","Africa","Europe",
            "Whose country's flag has the colors green, yellow and blue?","Cape Verde","Portugal","Brazil","Spain",
            "What is the name of the largest country in the world?", "The United States of America", "Russia", "China", "India",
            "What planet is closest to Earth?", "Venus", "Mars", "Mercury", "Jupiter"};
    private Integer answers[] = {3,3,2,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_trivia);

        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionG);
        TextAnswer1 = findViewById(R.id.textRaspunsG1);
        TextAnswer2 = findViewById(R.id.textRaspunsG2);
        TextAnswer3 = findViewById(R.id.textRaspunsG3);
        TextAnswer4 = findViewById(R.id.textRaspunsG4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }





    public void launchContorGK1(View view) {
        k=1;
        verifyFunctionG();
    }

    public void launchContorGK2(View view) {
        k=2;
        verifyFunctionG();
    }

    public void launchContorGK3(View view) {
        k=3;
        verifyFunctionG();
    }

    public void launchContorGK4(View view) {
        k=4;
        verifyFunctionG();
    }

    public void verifyFunctionG() {
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