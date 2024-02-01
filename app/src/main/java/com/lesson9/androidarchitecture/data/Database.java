package com.lesson9.androidarchitecture.data;

import com.lesson9.androidarchitecture.domain.User;

import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<User> getUsers() {
        return Arrays.asList(
                new User(1L, "User 1"),
                new User(2L, "User 2")
        );
    }
}
