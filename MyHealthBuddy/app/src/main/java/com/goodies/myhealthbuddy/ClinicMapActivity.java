package com.goodies.myhealthbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Clinic map activity, remember to implement ggl map, change activity type if needed
public class ClinicMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_map);
    }
}
