package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.greetbuzz.attencontrollapp.ColorListAdapter;
import com.greetbuzz.attencontrollapp.R;
import com.greetbuzz.attencontrollapp.databinding.ActivitySalaryReportBinding;
import com.greetbuzz.attencontrollapp.databinding.ActivityThemeSelectionBinding;

import java.util.ArrayList;

public class ThemeSelectionActivity extends AppCompatActivity {
    ActivityThemeSelectionBinding binding;
    ColorListAdapter adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThemeSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list.add("#DC143C");
        list.add("#FF0000");
        list.add("#B22222");
        list.add("#8B0000");
        list.add("#FA8072");
        list.add("#F08080");

        adapter = new ColorListAdapter(list,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.rcColorList.setLayoutManager(layoutManager);
        binding.rcColorList.setAdapter(adapter);
    }
}