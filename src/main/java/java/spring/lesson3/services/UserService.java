package java.spring.lesson3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.spring.lesson3.repo.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

}
