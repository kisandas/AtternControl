package com.greetbuzz.attencontrollapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PowerLogListAdapter extends RecyclerView.Adapter<PowerLogListAdapter.PowerLogHolder> {

    // List to store all the contact details
    private ArrayList<String> contactList;
    private Context mContext;

    public PowerLogListAdapter(ArrayList<String> contactsList, Context context) {
        this.contactList = contactsList;
        this.mContext = context;
    }

    // This method creates views for the RecyclerView by inflating the layout
    // Into the viewHolders which helps to display the items in the RecyclerView
    @Override
    public PowerLogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.item_power_log_list, parent, false);
        return new PowerLogHolder(view);
    }

    @Override
    public int getItemCount() {
        return contactList == null ? 0 : contactList.size();
    }

    // This method is called when binding the data to the views being created in RecyclerView
    @Override
    public void onBindViewHolder(@NonNull PowerLogHolder holder, final int position) {


    }

    // This is your ViewHolder class that helps to populate data to the view
    public class PowerLogHolder extends RecyclerView.ViewHolder {
        TextView tv_date_time;
        TextView tv_local_ip;
        TextView tv_wifi_name;

        public PowerLogHolder(View itemView) {
            super(itemView);
            tv_date_time = itemView.findViewById(R.id.tv_date_time);
            tv_local_ip = itemView.findViewById(R.id.tv_local_ip);
            tv_wifi_name = itemView.findViewById(R.id.tv_wifi_name);
        }


    }
}
