package GBjava.GBspring.lesson3.repo;

import GBjava.GBspring.lesson3.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
