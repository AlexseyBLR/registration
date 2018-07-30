package com.compit.registration.service;

import com.compit.registration.dao.UserDAO;
import com.compit.registration.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public void editUserInfo(String username, User user) {
//        userDAO.updateUserInfo(user.getFirstname(), user.getLastname(), user.getPatronymic(), user.getAge(), user.getSex(),
//                user.getProfile(), user.getEmail());
    }

    @Override
    public void editUserResult(String username, User user) {
//        userDAO.updateUserResults(user.getMathResult(), user.getPhysResult(), user.getLangResult(), user.getHimResult(),
//                user.getBioResult(), user.getEnglResult(), user.getEmail());
    }

    @Override
    public User findByUsername(String username) {
//        return userDAO.findUserByEmail(username);
        return null;
    }

    @Override
    public List<User> getAll() {
        return userDAO.findAll();
    }
}
