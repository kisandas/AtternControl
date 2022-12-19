package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.greetbuzz.attencontrollapp.R;
import com.greetbuzz.attencontrollapp.databinding.ActivityPowerLogBinding;
import com.greetbuzz.attencontrollapp.databinding.ActivityPowerLogReportBinding;

public class PowerLogReportActivity extends AppCompatActivity {
    ActivityPowerLogReportBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPowerLogReportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}