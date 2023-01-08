package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.module.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void update(int id, User user) {
        userDao.update(id, user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
}