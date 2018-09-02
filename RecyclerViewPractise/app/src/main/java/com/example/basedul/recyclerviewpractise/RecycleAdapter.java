package com.example.basedul.recyclerviewpractise;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecyViewHolder> {

    private Context context;
    private List<MainInformation> arrayList;

    public RecycleAdapter(Context context, List<MainInformation> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item_layout, null);
        RecyViewHolder recyViewHolder = new RecyViewHolder(view);
        return recyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyViewHolder recyViewHolder, int i) {
        MainInformation mainInformation = arrayList.get(i);
        recyViewHolder.getTitleText().setText(mainInformation.getTitleText());
        recyViewHolder.getDesText().setText(mainInformation.getDescriptionText());
        recyViewHolder.getImageView().setImageDrawable(context.getResources().getDrawable(mainInformation.getImage()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
