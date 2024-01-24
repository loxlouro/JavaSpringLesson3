package GBjava.GBspring.lesson3.controllers;

import GBjava.GBspring.lesson3.models.User;
import GBjava.GBspring.lesson3.services.UserService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(path = "/getAllUsers",method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(path = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@RequestParam("user") User user){
        return userService.saveUser(user);
    }

    @RequestMapping(path = "/deleteUser", method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam("user") User user){
        return userService.deleteUser(user);
    }
    @RequestMapping(path = "/getUser/{email}", method = RequestMethod.GET)
    public User getUserByEmail(@PathVariable("email") String email){
        return userService.findByEmail(email);
    }
}
