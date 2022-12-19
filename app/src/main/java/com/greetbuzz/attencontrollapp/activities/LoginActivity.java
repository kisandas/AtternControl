package com.greetbuzz.attencontrollapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.greetbuzz.attencontrollapp.MainActivity;
import com.greetbuzz.attencontrollapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                createHotspot();
//                if(!binding.etNumber.getText().toString().isEmpty() && !binding.etNumber.getText().toString().equals(""))
                     startActivity(new Intent(LoginActivity.this, OTPVerificationActivity.class));
            }
        });
    }



}