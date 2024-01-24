package GBjava.GBspring.lesson3.repo;

import GBjava.GBspring.lesson3.models.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> , ElasticsearchRepository<User, Long> {
    public User findByEmail(String email);
}
