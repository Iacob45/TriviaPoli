package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SportsTriviaActivity extends AppCompatActivity {


    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"What’s the diameter of a basketball hoop in centimeters?","46","42","38","33",
            "How many times has India won the Men’s Hockey World Cup in the Olympics?","3","2","1","0",
            "Which country has won the most World Cups?","Spain","Portugal","Brazil","The United Kingdom",
            "Which German multinational sportswear company is Messi an ambassador for?","Nike","Adidas","Puma","Fila"};
    private Integer answers[] = {1,1,3,2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_trivia);

        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionS);
        TextAnswer1 = findViewById(R.id.textRaspunsS1);
        TextAnswer2 = findViewById(R.id.textRaspunsS2);
        TextAnswer3 = findViewById(R.id.textRaspunsS3);
        TextAnswer4 = findViewById(R.id.textRaspunsS4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }





    public void launchContorSK1(View view) {
        k=1;
        verifyFunctionS();
    }

    public void launchContorSK2(View view) {
        k=2;
        verifyFunctionS();
    }

    public void launchContorSK3(View view) {
        k=3;
        verifyFunctionS();
    }

    public void launchContorSK4(View view) {
        k=4;
        verifyFunctionS();
    }

    public void verifyFunctionS() {
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