package com.ayub.springboot.hiber.service;

import com.ayub.springboot.hiber.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayub.springboot.hiber.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRep;

    @Override
    public void addUser(User user) {
        userRep.save(user);
        //userDao.addUser(user);
    }

    @Override
    public void deleteUser(long id) {
        //userDao.deleteUser(id);
        userRep.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
//        userDao.updateUser(user);
        userRep.save(user);

    }

    @Override
    public User getUserById(long id) {
//        return userDao.getUserById(id);
        return userRep.findById(id).orElse(null);
    }

    @Override
    public List<User> listUsers() {
//        return userDao.listUsers();
        return userRep.findAll();
    }
}
