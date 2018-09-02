package com.example.basedul.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] strings = new String[3];
        strings[0] = "I am basedul islam";
        strings[1] = "Bayojid bostami & Bodrujjaman";
        Log.i("Basedul islam", "Value of "+strings[1]);

        /*ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("পাঁচ");*/
        String [] arrayList = getResources().getStringArray(R.array.country_name);

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

    }
}
