package spring.SpringBootCRUD.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import spring.SpringBootCRUD.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public User findOne(int id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void delete(int id) {
        User user = em.find(User.class, id);
        if (user!=null) {
            em.remove(user);
        }
    }
}
