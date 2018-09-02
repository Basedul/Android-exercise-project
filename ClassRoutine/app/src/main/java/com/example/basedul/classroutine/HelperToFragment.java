package com.example.basedul.classroutine;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelperToFragment extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_to_fragment);

        fragmentManager = getSupportFragmentManager();
        myDatabase = Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "user_database").allowMainThreadQueries().build();
        if(findViewById(R.id.FrameLayout_id)!= null){
            if (savedInstanceState!=null){
                return;
            }

            HelperToFragment.fragmentManager.beginTransaction().replace(R.id.FrameLayout_id, new AddUserFragment()).addToBackStack(null).commit();
        }
    }
}
