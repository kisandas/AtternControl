package com.greetbuzz.attencontrollapp.activities.ui.manual_add;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.greetbuzz.attencontrollapp.databinding.FragmentManualAddBinding;


public class ManualAddFragment extends Fragment {

    private FragmentManualAddBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentManualAddBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        binding.rbInTimeAm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    binding.rbInTimePm.setChecked(false);
                }
            }
        });

        binding.rbInTimePm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    binding.rbInTimeAm.setChecked(false);
                }
            }
        });



        binding.rbOutTimeAm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    binding.rbOutTimePm.setChecked(false);
                }
            }
        });

        binding.rbOutTimePm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    binding.rbOutTimeAm.setChecked(false);
                }
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}