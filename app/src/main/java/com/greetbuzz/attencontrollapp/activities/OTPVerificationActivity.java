package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.greetbuzz.attencontrollapp.databinding.ActivityOtpverificationBinding;


public class OTPVerificationActivity extends AppCompatActivity {

    ActivityOtpverificationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpverificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OTPVerificationActivity.this, DashboardActivity.class));
            }
        });

    }
}