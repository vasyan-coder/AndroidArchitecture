package com.lesson9.androidarchitecture.presentation.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.lesson9.androidarchitecture.R;
import com.lesson9.androidarchitecture.presentation.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.users.observe(this, users -> {
            Log.d("myLogs", "Users loaded " + users);
        });

        if (savedInstanceState == null) viewModel.loadUsers();
    }
}