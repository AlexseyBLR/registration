package com.compit.registration.service;

import com.compit.registration.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void delete(User user);
    void editUserInfo(String username, User user);
    void editUserResult(String username, User user);
    User findByUsername(String username);
    List<User> getAll();

}
