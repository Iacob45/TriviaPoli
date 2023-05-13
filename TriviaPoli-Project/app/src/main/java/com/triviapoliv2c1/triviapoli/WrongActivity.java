package com.triviapoliv2c1.triviapoli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class WrongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
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