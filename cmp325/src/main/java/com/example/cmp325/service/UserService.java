package com.example.cmp325.service;
import java.util.List;

import com.example.cmp325.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();

}
