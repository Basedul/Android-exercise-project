package com.example.basedul.recyclerviewpractise;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView titleText, desText;
    public ImageView getImageView() {
        return imageView;
    }

    public TextView getTitleText() {
        return titleText;
    }

    public TextView getDesText() {
        return desText;
    }

    public RecyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView_list_item_layout_id);
        titleText = itemView.findViewById(R.id.textView_title_list_item_layout_id);
        desText = itemView.findViewById(R.id.textView_description_list_item_layout_id);
    }
}
