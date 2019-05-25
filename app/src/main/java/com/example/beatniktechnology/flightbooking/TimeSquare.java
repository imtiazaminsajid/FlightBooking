package com.example.beatniktechnology.flightbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.beatniktechnology.flightbooking.TripDetails.OnWay;
import com.squareup.timessquare.CalendarPickerView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeSquare extends AppCompatActivity {

    String selectDate;

    Button doneTimeSquareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_square);

        setTitle("Select Date");

        doneTimeSquareBtn = findViewById(R.id.doneTimeSquareBtn);

        doneTimeSquareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeSquare.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Date today = new Date();
        Calendar nextYear = Calendar.getInstance();
        nextYear.add(Calendar.YEAR, 1);

        CalendarPickerView calendarPickerView = findViewById(R.id.calendarPickerView);
        calendarPickerView.init(today, nextYear.getTime())
                .inMode(CalendarPickerView.SelectionMode.RANGE)
                .withSelectedDate(today);


        calendarPickerView.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {

                selectDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
                Toast.makeText(TimeSquare.this, selectDate, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onDateUnselected(Date date) {

            }
        });
    }
}
