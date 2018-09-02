package com.example.basedul.classroutine;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {
    public static final String TAG = "AddUserFragment";
    Button save;
    EditText title, description;
    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "ADD_user ");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        save = view.findViewById(R.id.SaveButtonId);
        title = view.findViewById(R.id.GivenTitleId);
        description = view.findViewById(R.id.DescriptionId);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ti = title.getText().toString();
                String des = description.getText().toString();

                NoteInformation user = new NoteInformation();
                user.setTitle(ti);
                user.setDescription(des);

                HelperToFragment.myDatabase.myDao().addUser(user);

                title.setText("");
                description.setText("");
                HelperToFragment.fragmentManager.beginTransaction().replace(R.id.FrameLayout_id, new Notes()).addToBackStack(null).commit();

            }
        });
        return  view;
    }

}
