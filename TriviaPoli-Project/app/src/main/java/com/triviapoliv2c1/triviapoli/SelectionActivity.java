package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

public class SelectionActivity extends AppCompatActivity {

    private static final String LOG_TAG = SelectionActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void launchHistoryActivity(View view) {
        Log.d(LOG_TAG, "Istorie");
        Intent intent1 = new Intent(this, HistoryTriviaActivity.class);
        startActivity(intent1);
    }
    public void launchChemistryActivity(View view) {
        Log.d(LOG_TAG, "Chimie");
        Intent intent2 = new Intent(this, ChemistryTriviaActivity.class);
        startActivity(intent2);


    }
    public void launchEntertainmentActivity(View view) {
        Log.d(LOG_TAG, "Divertisment");
        Intent intent3 = new Intent(this, EntertainmentTriviaActivity.class);
        startActivity(intent3);

    }
    public void launchArtActivity(View view) {
        Log.d(LOG_TAG, "Arta");
        Intent intent4 = new Intent(this, ArtTriviaActivity.class);
        startActivity(intent4);

    }
    public void launchSportsActivity(View view) {
        Log.d(LOG_TAG, "Sport");
        Intent intent5 = new Intent(this, SportsTriviaActivity.class);
        startActivity(intent5);

    }
    public void launchGeographyActivity(View view) {
        Log.d(LOG_TAG, "Geografie");
        Intent intent6 = new Intent(this, GeographyTriviaActivity.class);
        startActivity(intent6);

    }

    public void launchMainActivity(View view)
    {
        Intent intent7 = new Intent(this, MainActivity.class);
        startActivity(intent7);
    }
}