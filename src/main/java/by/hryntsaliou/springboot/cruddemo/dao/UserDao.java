package by.hryntsaliou.springboot.cruddemo.dao;

import by.hryntsaliou.springboot.cruddemo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
}
