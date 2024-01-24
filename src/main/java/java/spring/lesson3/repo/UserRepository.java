package java.spring.lesson3.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.spring.lesson3.models.User;

public interface UserRepository extends JpaRepository<User, Long> , ElasticsearchRepository<User, Long> {
    public User findByEmail(String email);
}
