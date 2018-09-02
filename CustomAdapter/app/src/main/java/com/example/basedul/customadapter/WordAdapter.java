package com.example.basedul.customadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = convertView;
        if(customView==null){
            customView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);

        TextView textView = (TextView)customView.findViewById(R.id.textViewFirstShow);
        textView.setText(word.getS1());
        TextView textView1 = (TextView)customView.findViewById(R.id.textViewSecondShow);
        textView1.setText(word.getS2());
        return customView;
    }
}
