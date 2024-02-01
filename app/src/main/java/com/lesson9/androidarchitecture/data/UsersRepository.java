package com.lesson9.androidarchitecture.data;

import com.lesson9.androidarchitecture.domain.User;

import java.util.List;

public class UsersRepository {

    public static List<User> getUsers() {
        return Database.getUsers();
    }
}
