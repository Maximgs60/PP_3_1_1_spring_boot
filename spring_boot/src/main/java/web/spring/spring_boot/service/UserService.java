package web.spring.spring_boot.service;

import web.spring.spring_boot.entity.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Integer id);
}
