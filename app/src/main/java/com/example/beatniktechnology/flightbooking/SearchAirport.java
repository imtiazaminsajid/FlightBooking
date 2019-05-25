package com.example.beatniktechnology.flightbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.example.beatniktechnology.flightbooking.Adapter.ExampleAdapter;
import com.example.beatniktechnology.flightbooking.Model.ExampleItem;

import java.util.ArrayList;
import java.util.List;

public class SearchAirport extends AppCompatActivity {
    private ExampleAdapter adapter;
    private List<ExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_airport);
        fillExampleList();
        setUpRecyclerView();

    }

    private void fillExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.airplane, "DHK", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "KHL", "Khulna International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "NHK", "Noakhali International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "BRI", "Barisal International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DIJ", "Dinajpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Delli", "Delli International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "SYL", "Syleth International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "RAJ", "Rajshahi International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "RNG", "Rangpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DHK", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "KHL", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "NHK", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "BRI", "Barisal International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DIJ", "Dinajpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Delli", "Delli International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "SYL", "Syleth International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Rajshahi", "Rajshahi International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Rangpur", "Rangpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "BRI", "Barisal International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DIJ", "Dinajpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Delli", "Delli International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "SYL", "Syleth International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Eight", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Rangpur", "Rangpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DHK", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "KHL", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "NHK", "Dhaka International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "BRI", "Barisal International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "DIJ", "Dinajpur International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "Delli", "Delli International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "SYL", "Syleth International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "RAJ", "Rajshahi International Airport"));
        exampleList.add(new ExampleItem(R.drawable.airplane, "RNG", "Rangpur International Airport"));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}
