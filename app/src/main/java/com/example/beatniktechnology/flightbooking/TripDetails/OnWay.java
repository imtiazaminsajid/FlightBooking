package com.example.beatniktechnology.flightbooking.TripDetails;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.beatniktechnology.flightbooking.PassengersAndCabinClass;
import com.example.beatniktechnology.flightbooking.R;
import com.example.beatniktechnology.flightbooking.Search;
import com.example.beatniktechnology.flightbooking.SearchAirport;
import com.example.beatniktechnology.flightbooking.TimeSquare;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnWay extends Fragment {

    CardView onWayDepatureCV, onWayPassengersCV;

    static OnWay instance;

    Button onWaySearchBtn;

    LinearLayout onWayDepatureAirport, onWayReturnAirport;


    public OnWay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_on_way, container, false);

        onWayDepatureCV = view.findViewById(R.id.onWayDepatureCV);
        onWayPassengersCV = view.findViewById(R.id.onWayPassengersCV);
        onWayDepatureAirport = view.findViewById(R.id.onWayDepatureAirport);
        onWayReturnAirport = view.findViewById(R.id.onWayReturnAirport);

        onWayDepatureAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        onWayReturnAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        onWaySearchBtn = view.findViewById(R.id.onWaySearchBtn);

        onWaySearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Search.class);
                startActivity(intent);
            }
        });

        onWayDepatureCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        onWayPassengersCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PassengersAndCabinClass.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public static OnWay getInstance() {
        if (instance == null)
            instance = new OnWay();
        return instance;
    }
}
