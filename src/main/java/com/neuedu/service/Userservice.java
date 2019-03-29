package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface Userservice {
    User login(User user);
   List<User> list(User user);
}
