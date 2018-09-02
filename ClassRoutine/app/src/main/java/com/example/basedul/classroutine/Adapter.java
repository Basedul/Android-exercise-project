package com.example.basedul.classroutine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    List<NoteInformation> arraList;

    public Adapter(Context context, List<NoteInformation> arraList) {
        this.context = context;
        this.arraList = arraList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        NoteInformation noteInformation = arraList.get(i);
        viewHolder.getTitle().setText(noteInformation.getTitle());
        viewHolder.getDescription().setText(noteInformation.getDescription());
    }

    @Override
    public int getItemCount() {
        return arraList.size();
    }
}
