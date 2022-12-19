package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.greetbuzz.attencontrollapp.R;
import com.greetbuzz.attencontrollapp.databinding.ActivityHelpBinding;
import com.greetbuzz.attencontrollapp.databinding.ActivityPowerLogBinding;

public class PowerLogActivity extends AppCompatActivity {
    ActivityPowerLogBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPowerLogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}