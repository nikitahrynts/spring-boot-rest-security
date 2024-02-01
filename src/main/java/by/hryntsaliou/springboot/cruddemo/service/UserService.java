package by.hryntsaliou.springboot.cruddemo.service;

import by.hryntsaliou.springboot.cruddemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);
}
