package com.example.basedul.classroutine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView title, description;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title_id);
        description = itemView.findViewById(R.id.description_id);
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getDescription() {
        return description;
    }


}
