package main.core.service;

import main.core.pojo.User;

import java.util.List;

public interface UserService {
    List<User> list();
    void delete(int id);
    void add(User user);
    void insert(User user);
    void update(User user);
}
