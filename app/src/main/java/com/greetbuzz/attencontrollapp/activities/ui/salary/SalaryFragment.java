package com.greetbuzz.attencontrollapp.activities.ui.salary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.greetbuzz.attencontrollapp.activities.SalaryReportActivity;
import com.greetbuzz.attencontrollapp.databinding.FragmentSalaryBinding;

public class SalaryFragment extends Fragment {

    private FragmentSalaryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSalaryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnGenerateReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(requireActivity(), SalaryReportActivity.class));
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