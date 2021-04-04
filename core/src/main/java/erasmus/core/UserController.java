package erasmus.core;

import erasmus.domain.User;
import erasmus.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/userss")
    public List<User> getUsers() {
        return userRepository.findAll();
    }


}
