package com.goodies.myhealthbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Exercise monitor activity, uses motion sensor
public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }
}
