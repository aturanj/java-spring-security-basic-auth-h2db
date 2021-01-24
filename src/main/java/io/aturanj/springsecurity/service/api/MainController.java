package io.aturanj.springsecurity.service.api;

import io.aturanj.springsecurity.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    public final UserRepository userRepository;

    @Autowired
    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "This is home page";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "This is admin page";
    }
}
