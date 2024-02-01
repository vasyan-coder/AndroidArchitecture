package com.lesson9.androidarchitecture.presentation.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lesson9.androidarchitecture.R;
import com.lesson9.androidarchitecture.domain.User;

import java.util.Arrays;
import java.util.List;



public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<User> loadedUsers = getUsers();

    }

    private List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "User 1"),
                new User(2L, "User 2")
        );
    }
}
