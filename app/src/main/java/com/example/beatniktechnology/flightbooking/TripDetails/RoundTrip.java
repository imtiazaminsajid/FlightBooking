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
public class RoundTrip extends Fragment {

    static RoundTrip instance;

    Button roundTripSearchBtn;

    LinearLayout roundTripDepartureAirport, roundTripReturnAirport;

    CardView roundTripDepartureCV,roundTripReturnCV,roundTripSelectTravalersCV;


    public RoundTrip() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_round_trip, container, false);

        roundTripDepartureCV = view.findViewById(R.id.roundTripDepartureCV);
        roundTripReturnCV = view.findViewById(R.id.roundTripReturnCV);
        roundTripSelectTravalersCV = view.findViewById(R.id.roundTripSelectTravalersCV);
        roundTripDepartureAirport = view.findViewById(R.id.roundTripDepartureAirport);
        roundTripReturnAirport = view.findViewById(R.id.roundTripReturnAirport);

        roundTripDepartureAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        roundTripReturnAirport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        roundTripSearchBtn = view.findViewById(R.id.roundTripSearchBtn);

        roundTripSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Search.class);
                startActivity(intent);
            }
        });


        roundTripDepartureCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        roundTripReturnCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        roundTripSelectTravalersCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), PassengersAndCabinClass.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public static RoundTrip getInstance() {
        if (instance == null)
            instance = new RoundTrip();
        return instance;
    }

}
