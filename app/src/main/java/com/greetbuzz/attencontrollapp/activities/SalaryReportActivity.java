package com.greetbuzz.attencontrollapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.greetbuzz.attencontrollapp.R;
import com.greetbuzz.attencontrollapp.databinding.ActivityPowerLogBinding;
import com.greetbuzz.attencontrollapp.databinding.ActivitySalaryReportBinding;

public class SalaryReportActivity extends AppCompatActivity {
    ActivitySalaryReportBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySalaryReportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}