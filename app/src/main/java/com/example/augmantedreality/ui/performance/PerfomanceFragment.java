package com.example.augmantedreality.ui.performance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.augmantedreality.R;

public class PerfomanceFragment extends Fragment {

    private PerfomanceViewModel perfomanceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        perfomanceViewModel =
                ViewModelProviders.of(this).get(PerfomanceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_perfomance, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        perfomanceViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}