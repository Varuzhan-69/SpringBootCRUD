package spring.SpringBootCRUD.service;


import spring.SpringBootCRUD.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findOne(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
