package com.example.basedul.classroutine;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Notes extends Fragment {

    public List<NoteInformation> arrayList = new ArrayList<>();

    public Notes() {
        //Toast.makeText(c.getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView recyclerView = new RecyclerView(getContext());
        Adapter adapter;
        FloatingActionButton floatingActionButton;


        View view = inflater.inflate(R.layout.fragment_notes, container, false);

        //View view1 = inflater.inflate(R.layout.layout_for_user_input, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        floatingActionButton = view.findViewById(R.id.fab_icon_item_id);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // HelperToFragment.fragmentManager.beginTransaction().replace(R.id.FrameLayout_id, new HelperToFragment()).addToBackStack(null).commit();
                NoteInformation noteInformation = new NoteInformation();
                Intent intent = new Intent();
                intent.setClass(getActivity(), HelperToFragment.class);
                getActivity().startActivity(intent);


            }
        });


        //final String[] st = new String[2];
        /*floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.dialog);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button

                //st[0] = t;
                //st[1] = d;
                //Log.i("Basedul islam", t);

                Button dialogButton = (Button) dialog.findViewById(R.id.button);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText ti  =(EditText) dialog.findViewById(R.id.title_id);
                        EditText des = (EditText) dialog.findViewById(R.id.des_id);
                        String t = ti.getText().toString();
                        String d = des.getText().toString();
                        arrayList.add(new NoteInformation(t, d));
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });*/

        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));
        arrayList.add(new NoteInformation("Bangladesh", "I love Bangladesh"));


        adapter = new Adapter(getContext(),arrayList);
        recyclerView.setAdapter(adapter);
        return view;
    }



}
