package mvc_rest_js.dao;

import mvc_rest_js.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User getUserById(Long id);
}
