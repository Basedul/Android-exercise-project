package com.example.basedul.practiseroomdatabase;


import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyappDatabase myappDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        myappDatabase = Room.databaseBuilder(getApplicationContext(), MyappDatabase.class, "user_database").allowMainThreadQueries().build();
        if(findViewById(R.id.FrameLayout_id)!= null){
            if (savedInstanceState!=null){

                return;
            }

            MainActivity.fragmentManager.beginTransaction().replace(R.id.FrameLayout_id, new HomeFragment()).addToBackStack(null).commit();
        }
    }
}
