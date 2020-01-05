package com.example.augmantedreality.ui.performance;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.augmantedreality.BasementActivity;
import com.example.augmantedreality.R;
import com.example.augmantedreality.ui.User;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class PerfomanceFragment extends Fragment {

    private PerfomanceViewModel perfomanceViewModel;

    private FirebaseAuth mAuth;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference myRef;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private String userID;

    public static ArrayList<BarEntry> barEntries = new ArrayList<>();
    public static User tmpUser;
    public static BarChart barChart;
    public static BarDataSet barDataSet;
    public static ArrayList<String> theDates;
    public static BarData theData;
    public View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        perfomanceViewModel =
                ViewModelProviders.of(this).get(PerfomanceViewModel.class);
        root = inflater.inflate(R.layout.fragment_perfomance, container, false);
        barChart = root.findViewById(R.id.perfomanceBarChart);

        barChart.setData(theData);
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
        barChart.animateY(5000);

        return root;
    }

}