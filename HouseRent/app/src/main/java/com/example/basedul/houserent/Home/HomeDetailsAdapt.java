package com.example.basedul.houserent.Home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.basedul.houserent.R;

import java.util.List;

public class HomeDetailsAdapt extends ArrayAdapter<HomeDetails>{

    private ImageView homeImage;
    private TextView name, location, numberOfBedroomsAndNumberOfKitchens;
    private RatingBar ratingBar;

    public HomeDetailsAdapt(@NonNull Context context, int resource, @NonNull List<HomeDetails> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_container, parent, false);
        }

        HomeDetails homeDetails = getItem(position);

        name = (TextView) view.findViewById(R.id.text_view_for_name_of_house_in_list_item_container_xml_file);
        name.setText("Name "+homeDetails.getNameOfHome());

        location = (TextView) view.findViewById(R.id.textViewForLocationOfHouseInlisetItemContainerXMLfile);
        location.setText("Location "+homeDetails.getLocation());

        numberOfBedroomsAndNumberOfKitchens = (TextView) view.findViewById(R.id.textViewForNumberOfBedroomsAndKitchen);
        numberOfBedroomsAndNumberOfKitchens.setText("Number of kitchen"+Integer.toString(homeDetails.getNumberOfBedroomsAndNumberOfKitchen()));

        homeImage = (ImageView) view.findViewById(R.id.image_view_for_image_show_in_list_item_container_xml_file);
        homeImage.setImageResource(homeDetails.getPhotoOfHome());

        return view;
    }
}
