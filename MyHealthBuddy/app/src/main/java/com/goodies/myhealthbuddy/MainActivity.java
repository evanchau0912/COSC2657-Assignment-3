package com.goodies.myhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


//Main activity, TODO: remember to make a log-in screen before this main activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toExercise(View view) {
        Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
        startActivity(intent);
    }

    public void toAdvice(View view) {
        Intent intent = new Intent(MainActivity.this, AdviceActivity.class);
        startActivity(intent);
    }

    public void toRateUs(View view) {
        Intent intent = new Intent(MainActivity.this, RateUsActivity.class);
        startActivity(intent);
    }
}
