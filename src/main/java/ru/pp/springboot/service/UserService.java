package ru.pp.springboot.service;

import ru.pp.springboot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User updateUserById(int id, User user);
    List<User> listOfUsers();
    User findById(int id);
    void deleteUserById(int id);
}
