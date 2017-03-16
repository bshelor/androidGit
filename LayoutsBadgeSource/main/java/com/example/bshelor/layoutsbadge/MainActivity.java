package com.example.bshelor.layoutsbadge;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list_values;
    private EditText newGrocery;
    private Spinner groceryType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate called");

        newGrocery = (EditText) findViewById(R.id.newGrocery);
        groceryType = (Spinner) findViewById(R.id.typeSelect);

        list_values = new ArrayList<>();
    }

    public void addItem(View view) {
        // add grocery name
        String new_grocery = newGrocery.getText().toString();
        new_grocery = new_grocery + " - " + groceryType.getSelectedItem().toString();
        list_values.add(new_grocery);

        newGrocery.setText("");
    }

    public void finish(View view) {
        //addItem(view);
        Intent nextActivity = new Intent(getApplicationContext(), GroceryDisplay.class);
        nextActivity.putStringArrayListExtra("list_values", list_values);
        startActivity(nextActivity);
    }
}
