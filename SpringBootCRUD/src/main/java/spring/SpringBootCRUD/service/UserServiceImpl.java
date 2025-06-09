package spring.SpringBootCRUD.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.SpringBootCRUD.dao.UserDao;
import spring.SpringBootCRUD.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userDao.update(updatedUser);
    }

    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
