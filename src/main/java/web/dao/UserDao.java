package web.dao;

import web.module.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();

    User getUser(int id);

    void update(int id, User user);

    void delete(int id);

    void add(User user);
}