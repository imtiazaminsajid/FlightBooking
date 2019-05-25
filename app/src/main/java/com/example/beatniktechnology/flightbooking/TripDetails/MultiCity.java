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
public class MultiCity extends Fragment {

    static MultiCity instance;

    Button multiCityButton;

    LinearLayout multiCityDepatureAirportOne, multiCityDepatureAirportTwo, multiCityDepatureAirportThree;
    LinearLayout multiCityReturnAirportOne, multiCityReturnAirportTwo, multiCityReturnAirportThree;

    CardView multiCitySelectTravalersCV, multiCityReturnOne, multiCityReturnTwo, multiCityReturnThree;


    public MultiCity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_multi_city, container, false);

        multiCitySelectTravalersCV =  view.findViewById(R.id.multiCitySelectTravalersCV);
        multiCityReturnOne =  view.findViewById(R.id.multiCityReturnOne);
        multiCityReturnTwo =  view.findViewById(R.id.multiCityReturnTwo);
        multiCityReturnThree =  view.findViewById(R.id.multiCityReturnThree);

        multiCityDepatureAirportOne =  view.findViewById(R.id.multiCityDepatureAirportOne);
        multiCityDepatureAirportTwo =  view.findViewById(R.id.multiCityDepatureAirportTwo);
        multiCityDepatureAirportThree =  view.findViewById(R.id.multiCityDepatureAirportThree);


        multiCityDepatureAirportOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        multiCityDepatureAirportTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        multiCityDepatureAirportThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });

        multiCityReturnAirportOne =  view.findViewById(R.id.multiCityReturnAirportOne);
        multiCityReturnAirportTwo =  view.findViewById(R.id.multiCityReturnAirportTwo);
        multiCityReturnAirportThree =  view.findViewById(R.id.multiCityReturnAirportThree);

        multiCityReturnAirportOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });
        multiCityReturnAirportTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });
        multiCityReturnAirportThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchAirport.class);
                startActivity(intent);
            }
        });


        multiCityButton =  view.findViewById(R.id.multiCityButton);

        multiCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Search.class);
                startActivity(intent);
            }
        });

        multiCitySelectTravalersCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PassengersAndCabinClass.class);
                startActivity(intent);
            }
        });

        multiCityReturnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        multiCityReturnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        multiCityReturnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeSquare.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public static MultiCity getInstance() {
        if (instance == null)
            instance = new MultiCity();
        return instance;
    }

}
