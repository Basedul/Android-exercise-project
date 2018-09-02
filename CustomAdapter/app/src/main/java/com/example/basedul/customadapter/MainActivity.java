package com.example.basedul.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> arrayList = new ArrayList<Word>();
        arrayList.add(new Word("Me", "Basedul islam"));
        arrayList.add(new Word("Me", "Basedul islam"));
        arrayList.add(new Word("Me", "Basedul islam"));
        arrayList.add(new Word("Me", "Basedul islam"));
        arrayList.add(new Word("Me", "Basedul islam"));

        WordAdapter wordAdapter = new WordAdapter(this, arrayList);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "postion number is "+i, Toast.LENGTH_LONG).show();
            }
        });

        listView.setAdapter(wordAdapter);
    }
}
