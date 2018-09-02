package com.example.basedul.recyclerviewpractise;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MainInformation> arraList;
    RecycleAdapter recycleAdapter;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_icon_item_id);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello vai", Toast.LENGTH_LONG).show();
            }
        });
        arraList = new ArrayList<>();

        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_one, "Bangladesh", "Bangladesh is my lovely country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        arraList.add(new MainInformation(R.drawable.love_two, "Japan", "Japan is my sweet country"));
        recycleAdapter = new RecycleAdapter(getApplicationContext(), arraList);
        recyclerView.setAdapter(recycleAdapter);
    }
}
