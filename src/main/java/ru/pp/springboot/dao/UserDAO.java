package ru.pp.springboot.dao;

import ru.pp.springboot.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    User updateUser(int id, User user);
    List<User> listOfUsers();
    User findById(int id);
    void deleteUser(int id);
}
