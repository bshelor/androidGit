package com.example.bshelor.layoutsbadge;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GroceryDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_display);

        ArrayList<String> list_values;
        ArrayAdapter<String> list_adapter;

        // receive intent with string array from MainActivity
        Intent i = getIntent();
        list_values = i.getStringArrayListExtra("list_values");

        // Set array adapter for finished display of groceries
        list_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_values);

        // find the listView to display in and set the adapter
        ListView grocery_display = (ListView) findViewById(android.R.id.list);
        grocery_display.setAdapter(list_adapter);
    }
}
