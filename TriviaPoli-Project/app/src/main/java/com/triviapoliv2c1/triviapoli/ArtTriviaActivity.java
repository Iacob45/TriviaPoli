package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ArtTriviaActivity extends AppCompatActivity {


    private TextView TextQuestion;
    private TextView TextAnswer1;
    private TextView TextAnswer2;
    private TextView TextAnswer3;
    private TextView TextAnswer4;
    private Integer k = 0;
    private Integer x = 0;

    private String texts[] = {"Which of these is not an element of art?","Texture","Line","Color","Balance",
            "Who is credited as the designer of the many statues which decorated the Parthenon?", "Phidias","Praxiteles","Hesiod","Scopas",
            "Who painted ‘The Starry Night’?","Vincent van Gogh","Leonardo da Vinci","Pablo Picasso","Rembrandt",
            "In which country can you find the Terracota warriors?","India","China","Japan","Mongolia"};
    private Integer answers[] = {4,1,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_trivia);

        Random ran = new Random();
        x = ran.nextInt(answers.length);

        TextQuestion = findViewById(R.id.textQuestionA);
        TextAnswer1 = findViewById(R.id.textRaspunsA1);
        TextAnswer2 = findViewById(R.id.textRaspunsA2);
        TextAnswer3 = findViewById(R.id.textRaspunsA3);
        TextAnswer4 = findViewById(R.id.textRaspunsA4);

        TextQuestion.setText(texts[x*5]);
        TextAnswer1.setText(texts[x*5+1]);
        TextAnswer2.setText(texts[x*5+2]);
        TextAnswer3.setText(texts[x*5+3]);
        TextAnswer4.setText(texts[x*5+4]);
    }





    public void launchContorAK1(View view) {
        k=1;
        verifyFunctionA();
    }

    public void launchContorAK2(View view) {
        k=2;
        verifyFunctionA();
    }

    public void launchContorAK3(View view) {
        k=3;
        verifyFunctionA();
    }

    public void launchContorAK4(View view) {
        k=4;
        verifyFunctionA();
    }

    public void verifyFunctionA() {
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