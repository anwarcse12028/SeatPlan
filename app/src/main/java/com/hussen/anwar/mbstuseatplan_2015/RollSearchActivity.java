package com.hussen.anwar.mbstuseatplan_2015;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RollSearchActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String[] UNIT = {"Unit-A","Unit-B","Unit-C","Unit-D"};
    ArrayAdapter<String>unitList;

    EditText editTextRoll;
    Spinner unit;

    String stringRoll;
    String stringUnit;
    String stringSeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editTextRoll = (EditText) findViewById(R.id.editTextRollNumber);
        unit = (Spinner) findViewById(R.id.spinner);
        unit.setOnItemSelectedListener(this);
        unitList = new ArrayAdapter<String>(this,R.layout.spinner_center_item, UNIT);
        unitList.setDropDownViewResource(R.layout.spinner_center_item);
        unit.setAdapter(unitList);


    }

    public void seatPlan(View view) {
        stringRoll = editTextRoll.getText().toString();
        if(stringRoll.length()>7){
            Toast.makeText(getApplicationContext(),"Please Enter your Correct  Roll",Toast.LENGTH_LONG).show();
        }else {

            //stringSeat = "new Academic building , Dept. of CSE, Room No. 212, MBSTU";
            if (stringUnit.equals("Unit-A") && !stringRoll.equals("")) {

                int roll = Integer.parseInt(stringRoll);
                stringSeat = "";
                if (roll < 4892) {
                    //Range 1 to 4891
                    UnitA unitA = new UnitA();
                    stringSeat = unitA.student_info(Integer.parseInt(stringRoll));

                } else if (roll < 9828) {
                    //Range 4892 to 9827
                    UnitA1 unitA1 = new UnitA1();
                    stringSeat = unitA1.student_info(Integer.parseInt(stringRoll));

                } else if (roll < 14400) {
                    //Range 9828 to 14399
                    UnitA2 unitA2 = new UnitA2();
                    stringSeat = unitA2.student_info(Integer.parseInt(stringRoll));

                } else {
                    //Range 14400 to 18102
                    UnitA3 unitA3 = new UnitA3();
                    stringSeat = unitA3.student_info(Integer.parseInt(stringRoll));
                }


            } else if (stringUnit.equals("Unit-B") && !stringRoll.equals("")) {
                int roll = Integer.parseInt(stringRoll);

                stringSeat = "";
                if (roll < 34892) {
                    //Range 30001 to 34891
                    UnitB unitB = new UnitB();
                    stringSeat = unitB.student_info(Integer.parseInt(stringRoll));

                } else if (roll < 39828) {
                    //Range 34892 to 39827
                    UnitB1 unitB1 = new UnitB1();
                    stringSeat = unitB1.student_info(Integer.parseInt(stringRoll));

                } else if (roll < 44400) {
                    //Range 39828 to 44399
                    UnitB2 unitB2 = new UnitB2();
                    stringSeat = unitB2.student_info(Integer.parseInt(stringRoll));

                } else if (roll < 47195) {
                    //Range 44400 to 47194
                    UnitB3 unitB3 = new UnitB3();
                    stringSeat = unitB3.student_info(Integer.parseInt(stringRoll));
                } else {
                    //Range 47195 to 49007
                    UnitB4 unitB4 = new UnitB4();
                    stringSeat = unitB4.student_info(Integer.parseInt(stringRoll));
                }


            } else if (stringUnit.equals("Unit-C") && !stringRoll.equals("")) {
                UnitC unitC = new UnitC();
                stringSeat = unitC.student_info(Integer.parseInt(stringRoll));

            } else if (stringUnit.equals("Unit-D") && !stringRoll.equals("")) {
                UnitD unitD = new UnitD();
                stringSeat = unitD.student_info(Integer.parseInt(stringRoll));

            }


            if (!stringRoll.equals("") && !stringSeat.equals("")) {
                Intent intent = new Intent(this, DisplayResultActivity.class);
                intent.putExtra("stringRoll", stringRoll);
                intent.putExtra("stringUnit", stringUnit);
                intent.putExtra("stringSeat", stringSeat);


                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Please Enter your Correct  rool", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        stringUnit = UNIT[position];

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void importantNotice(View view){
        Intent intent = new Intent(this, direction.class);
        startActivity(intent);
    }
    public void aboutUs(View view){
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}
