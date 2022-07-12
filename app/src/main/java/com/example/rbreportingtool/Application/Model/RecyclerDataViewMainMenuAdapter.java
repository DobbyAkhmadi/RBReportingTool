package com.example.rbreportingtool.Application.Model;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rbreportingtool.R;

import java.util.ArrayList;

public class RecyclerDataViewMainMenuAdapter extends RecyclerView.Adapter<RecyclerDataViewMainMenuAdapter.RecyclerViewHolder> {

    private final ArrayList<RecyclerDataMainMenu> dataMenuArrayList;

    public RecyclerDataViewMainMenuAdapter(ArrayList<RecyclerDataMainMenu> recyclerDataArrayList) {
        this.dataMenuArrayList = recyclerDataArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_grid, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        RecyclerDataMainMenu recyclerData = dataMenuArrayList.get(position);
        holder.idText.setText(recyclerData.getTitle());
        holder.idImage.setImageResource(recyclerData.getImageId());
        holder.idImage.setOnClickListener(v -> {
            Context context = v.getContext();
            if (position == 0) {

            } else if (position == 1) {

            }
        });
    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return dataMenuArrayList.size();
    }

    //View Holder Class to handle Recycler View.
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        // private final TextView idText;
        private final ImageView idImage;
        private final TextView idText;
        private CountDownTimer timer;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            idImage = itemView.findViewById(R.id.idImage);
            idText = itemView.findViewById(R.id.idText);
        }

    }
}
