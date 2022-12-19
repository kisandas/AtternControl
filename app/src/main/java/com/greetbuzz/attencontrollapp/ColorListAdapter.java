package com.greetbuzz.attencontrollapp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorListAdapter extends RecyclerView.Adapter<ColorListAdapter.ViewHolder> {

    // List to store all the contact details
    private ArrayList<String> contactList;
    private Context mContext;
    int selectedPosition = -1;

    public ColorListAdapter(ArrayList<String> contactsList, Context context) {
        this.contactList = contactsList;
        this.mContext = context;
    }

    // This method creates views for the RecyclerView by inflating the layout
    // Into the viewHolders which helps to display the items in the RecyclerView
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.item_color_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return contactList == null ? 0 : contactList.size();
    }

    // This method is called when binding the data to the views being created in RecyclerView
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        if (selectedPosition == position)
            holder.iv_color.setBackground(mContext.getDrawable(R.drawable.ic_color_bg));
        else
            holder.iv_color.setBackground(null);

        holder.iv_color.setColorFilter(Color.parseColor(contactList.get(position)));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPosition = position;
                notifyDataSetChanged();
            }
        });

    }

    // This is your ViewHolder class that helps to populate data to the view
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_color;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_color = itemView.findViewById(R.id.iv_color);

        }


    }
}
