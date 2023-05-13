package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class EntertainmentTriviaActivity extends AppCompatActivity {


    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"What movie does NOT have Brad Pitt in it?","Oceans 13","Burn After Reading","300","Troy",
            "With whom did Lionel Richie co-write the ‘80s hit song for Africa,‘We are the world’?","Paul Simon","Stevie Wonder","Kenny Rogers","Michael Jackson",
            "Morticia, Wednesday and Pugsley are all part of which spooky cartoon series?","Beetlejuice","The Addams Family","Coraline","Courage the Cowardly Dog",
            "Which Disney movie is based on William Shakespeare’s Hamlet?","The Lion King","Avatar","Little Mermaid","Mulan"};
    private Integer answers[] = {3,4,2,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_trivia);

        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionE);
        TextAnswer1 = findViewById(R.id.textRaspunsE1);
        TextAnswer2 = findViewById(R.id.textRaspunsE2);
        TextAnswer3 = findViewById(R.id.textRaspunsE3);
        TextAnswer4 = findViewById(R.id.textRaspunsE4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }





    public void launchContorEK1(View view) {
        k=1;
        verifyFunctionE();
    }

    public void launchContorEK2(View view) {
        k=2;
        verifyFunctionE();
    }

    public void launchContorEK3(View view) {
        k=3;
        verifyFunctionE();
    }

    public void launchContorEK4(View view) {
        k=4;
        verifyFunctionE();
    }

    public void verifyFunctionE() {
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