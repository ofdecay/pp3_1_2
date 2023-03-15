package ru.pp.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pp.springboot.dao.UserDAO;
import ru.pp.springboot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    @Override
    public User updateUserById(int id, User user) {
        return userDAO.updateUser(id, user);
    }

    @Override
    public List<User> listOfUsers() {
        return userDAO.listOfUsers();
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {
        userDAO.deleteUser(id);
    }
}
