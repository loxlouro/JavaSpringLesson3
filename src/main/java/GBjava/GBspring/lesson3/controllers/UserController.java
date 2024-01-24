package GBjava.GBspring.lesson3.controllers;

import GBjava.GBspring.lesson3.services.UserService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

}
