package com.hussen.anwar.mbstuseatplan_2015;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {

    TextView  roll;
    TextView  unit;
    TextView seat;

    String stringRoll;
    String stringUnit;
    String stringSeat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        roll = (TextView)findViewById(R.id.textViewRoll);
        unit = (TextView)findViewById(R.id.textViewUnit);
        seat = (TextView)findViewById(R.id.textViewSeat);

        stringRoll = getIntent().getStringExtra("stringRoll");
        stringUnit = getIntent().getStringExtra("stringUnit");
        stringSeat = getIntent().getStringExtra("stringSeat");

        unit.setText(stringUnit);
        roll.setText("Roll No. "+stringRoll);
        seat.setText(stringSeat);



    }

}
