package com.example.beatniktechnology.flightbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PassengersAndCabinClass extends AppCompatActivity {

    Button passengerDoneBtn;
    int adults;
    int children;
    int infants;
    TextView adultsTV, childernTV, infantsTV;
    ImageView adultsMinus,adultsPlus, childernMinus, childernPlus, infantsMinus, infantsPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passengers_and_cabin_class);

        setTitle("Passengers and Cabin Class");

        adultsTV =  findViewById(R.id.adultsTv);
        adultsMinus = findViewById(R.id.adultsMinus);
        adultsPlus = findViewById(R.id.adultsPlus);

        adultsMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus();
            }
        });

        adultsPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus();
            }
        });

        childernTV = findViewById(R.id.childernTV);
        childernMinus = findViewById(R.id.childernMinus);
        childernPlus = findViewById(R.id.childernPlus);


        childernMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (children == 0){
                    Toast.makeText(getApplicationContext(), "Select Seat Quantity", Toast.LENGTH_SHORT).show();

                } else {
                    int childrenminus = children-1;
                    children = childrenminus;
                    childernTV.setText(children+"");
                }
            }
        });

        childernPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int childrenPlus = children+1;
                children = childrenPlus;
                childernTV.setText(children+"");
            }
        });


        infantsTV = findViewById(R.id.infantsTV);
        infantsMinus = findViewById(R.id.infantsMinus);
        infantsPlus = findViewById(R.id.infantsPlus);

        infantsMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infants == 0){
                    Toast.makeText(getApplicationContext(), "Select Seat Quantity", Toast.LENGTH_SHORT).show();

                } else {
                    int infantsminus = infants-1;
                    infants = infantsminus;
                    infantsTV.setText(infants+"");
                }
            }
        });

        infantsPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int infantsPlus = infants+1;
                infants = infantsPlus;
                infantsTV.setText(infants+"");
            }
        });

        passengerDoneBtn = findViewById(R.id.passengerDoneBtn);
        passengerDoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(PassengersAndCabinClass.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
    private void minus() {

        if (adults == 0){
            Toast.makeText(this, "Select Seat Quantity", Toast.LENGTH_SHORT).show();

        } else {
            int minus = adults-1;
            adults = minus;
            adultsTV.setText(adults+"");
        }
    }

    private void plus(){
        int plus = adults+1;
        adults = plus;
        adultsTV.setText(adults+"");


    }
}
