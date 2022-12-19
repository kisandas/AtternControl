package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;

import com.greetbuzz.attencontrollapp.R;
import com.greetbuzz.attencontrollapp.databinding.ActivitySplashBinding;
import com.greetbuzz.attencontrollapp.databinding.ActivityUpdateTimeBinding;

public class UpdateTimeActivity extends AppCompatActivity {
    ActivityUpdateTimeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdateTimeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}