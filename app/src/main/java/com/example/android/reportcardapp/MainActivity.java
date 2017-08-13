package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard davidJones = new ReportCard();
        davidJones.setName("David Jones");
        davidJones.setMathsScore(96);
        davidJones.setEnglishScore(87);
        davidJones.setScienceScore(77);
        davidJones.setGeographyScore(66);
        davidJones.setHistoryScore(87);
        davidJones.setStudentID(1233457);
        davidJones.setTeacherMessage("David has had a fantastic Semester!");


        TextView results = (TextView) findViewById(R.id.results);
        results.setText(davidJones.toString());



    }



}
