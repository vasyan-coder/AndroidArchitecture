package com.lesson9.androidarchitecture.presentation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.lesson9.androidarchitecture.data.UsersRepository;
import com.lesson9.androidarchitecture.domain.User;

import java.util.List;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<List<User>> _users = new MutableLiveData<>();
    public final LiveData<List<User>> users = _users;

    public void loadUsers() {
        List<User> loadedUsers = UsersRepository.getUsers();
        _users.setValue(loadedUsers);
    }
}
