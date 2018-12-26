package com.goodies.myhealthbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Health advice activity, use heat sensor
public class AdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
    }

    //Go to clinic map activity
    public void findClinics(View view) {
        Intent intent = new Intent(AdviceActivity.this, ClinicMapActivity.class);
        startActivity(intent);
    }
}
