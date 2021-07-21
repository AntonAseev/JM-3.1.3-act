package Rest_JS.dao;

import Rest_JS.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User getUserById(Long id);
}
