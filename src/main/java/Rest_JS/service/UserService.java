package Rest_JS.service;

import Rest_JS.models.User;

import java.util.List;

public interface UserService {
    User save(User user);
    void delete(Long id);
    List<User> findAll();
    User findByUsername(String username);
    User getUserById(Long id);
    User update(User user);
}