package mvc_rest_js.service;

import mvc_rest_js.models.User;
import mvc_rest_js.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;


    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public User save(User user) {
        user.setPassword(user.getPassword());
        return userDao.save(user);
    }

    @Override
    public User update(User user) {
        user.setPassword(user.getPassword().isEmpty() ? findByUsername(user.getUsername()).getPassword() : user.getPassword());
        return userDao.save(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
