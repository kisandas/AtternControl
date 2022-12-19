package com.greetbuzz.attencontrollapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardInOutAdapter extends RecyclerView.Adapter<DashboardInOutAdapter.ViewHolder> {

    // List to store all the contact details
    private ArrayList<String> contactList;
    private Context mContext;

    public DashboardInOutAdapter(ArrayList<String> contactsList, Context context) {
        this.contactList = contactsList;
        this.mContext = context;
    }

    // This method creates views for the RecyclerView by inflating the layout
    // Into the viewHolders which helps to display the items in the RecyclerView
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.item_dashboard_in_out_time, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return contactList == null ? 0 : contactList.size();
    }

    // This method is called when binding the data to the views being created in RecyclerView
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


    }

    // This is your ViewHolder class that helps to populate data to the view
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_in_time;
        TextView tv_out_time;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_in_time = itemView.findViewById(R.id.tv_in_time);
            tv_out_time = itemView.findViewById(R.id.tv_out_time);
        }


    }
}
