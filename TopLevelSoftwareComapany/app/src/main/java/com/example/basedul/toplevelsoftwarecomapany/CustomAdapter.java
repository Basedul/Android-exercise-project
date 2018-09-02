package com.example.basedul.toplevelsoftwarecomapany;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<AllInformation>{

    public CustomAdapter(@NonNull Context context,  @NonNull ArrayList<AllInformation> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = convertView;
        if(customView == null){
            customView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        AllInformation allInformation = getItem(position);

        TextView comapanyName = (TextView)customView.findViewById(R.id.textViewCompanyNameInListItemLayout);
        comapanyName.setText(allInformation.getS());

        TextView companyLink = (TextView)customView.findViewById(R.id.textViewCompanyLinkInListItemLayout);
        companyLink.setText(allInformation.getS1());

        ImageView companyImage = (ImageView)customView.findViewById(R.id.imageViewOnlistItemLayout);
        companyImage.setImageResource(allInformation.getImage());

        return customView;
    }
}
