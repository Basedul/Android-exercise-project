package com.example.basedul.practiseroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowData extends Fragment {

    private TextView textView;
    public ShowData() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_show_data, container, false);
        textView = (TextView)view.findViewById(R.id.textView_showText);
        List<User> list = MainActivity.myappDatabase.myDao().getUsers();
        String sst = "";
        for(User s: list){
            sst+=s.getTitle()+" "+s.getDescription();
        }
        textView.setText(sst);
        return view;
    }

}
