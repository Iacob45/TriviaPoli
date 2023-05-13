package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class ChemistryTriviaActivity extends AppCompatActivity {

    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"Copper and tin mix to create which alloy?","Steel","Bronze","Aluminum","Steel","What are substances that control the rates of chemical reactions",
            "Reactants","Catalysts","Isotopes","Cathodes","The particle that has the smallest mass is the","Electron","Ion","Nucleus","Quarks",
            "When a beam of white rays is dispersed by a prism which colour will be refracted to a larger extent?","Red","Green","Violet","Yellow",
            "Which element has no neutrons in it?","Helium","Hydrogen","Xenon","Mercury"};
    private Integer answers[] = {2,2,4,3,2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_trivia);

        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionC);
        TextAnswer1 = findViewById(R.id.textRaspunsC1);
        TextAnswer2 = findViewById(R.id.textRaspunsC2);
        TextAnswer3 = findViewById(R.id.textRaspunsC3);
        TextAnswer4 = findViewById(R.id.textRaspunsC4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }

    public void launchContorCK1(View view) {
        k=1;
        verifyFunctionC();
    }

    public void launchContorCK2(View view) {
        k=2;
        verifyFunctionC();
    }

    public void launchContorCK3(View view) {
        k=3;
        verifyFunctionC();
    }

    public void launchContorCK4(View view) {
        k=4;
        verifyFunctionC();
    }

    public void verifyFunctionC() {
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