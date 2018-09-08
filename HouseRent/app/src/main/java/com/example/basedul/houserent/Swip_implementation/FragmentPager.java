package com.example.basedul.houserent.Swip_implementation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.basedul.houserent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPager extends Fragment {


    public FragmentPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragment_pager, container, false);
        Bundle args = getArguments();

        TextView textView = view.findViewById(R.id.text_view_id_in_fragment_pager_xml_file);
        String countedValue = Integer.toString(args.getInt("Count"));
        textView.setText("This is swip view page "+countedValue);

        return view;
    }

}
