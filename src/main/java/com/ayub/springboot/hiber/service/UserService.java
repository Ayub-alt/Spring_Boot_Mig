package com.ayub.springboot.hiber.service;

import com.ayub.springboot.hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    User getUserById(long id);
    List<User> listUsers();
}
