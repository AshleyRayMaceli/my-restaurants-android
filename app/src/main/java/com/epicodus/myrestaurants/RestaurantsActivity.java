package com.epicodus.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {
    private TextView mLocationTextView;
    private ListView mListView;
    private String[] restaurants = new String[] {"Life of Pie", "Pine State Biscuits", "Boxer Ramen", "Lardo", "Rice Junkies", "E-San Thai", "Salt & Straw", "Stella Taco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);
        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near " + location);
    }
}
