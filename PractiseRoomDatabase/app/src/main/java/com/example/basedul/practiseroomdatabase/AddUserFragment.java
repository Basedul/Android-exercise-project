package com.example.basedul.practiseroomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {

    Button save;
    EditText id, title, description;
    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        save = view.findViewById(R.id.SaveButtonId);
        id = view.findViewById(R.id.edittext_primary_id);
        title = view.findViewById(R.id.GivenTitleId);
        description = view.findViewById(R.id.DescriptionId);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pri_id = Integer.parseInt(id.getText().toString());
                String ti = title.getText().toString();
                String des = description.getText().toString();

                User user = new User();
                user.setId(pri_id);
                user.setTitle(ti);
                user.setDescription(des);

                MainActivity.myappDatabase.myDao().addUser(user);

                id.setText("");
                title.setText("");
                description.setText("");

                MainActivity.fragmentManager.beginTransaction().replace(R.id.FrameLayout_id, new ShowData()).addToBackStack(null).commit();
            }
        });
        return  view;
    }

}
