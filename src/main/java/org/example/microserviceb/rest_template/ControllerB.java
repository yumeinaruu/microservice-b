package org.example.microserviceb.rest_template;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class ControllerB {
    @PostMapping("/user")
    public User returnUser(@RequestParam("user_id") Integer id) {
        System.out.println("I am here");
        if (id == 1) {
            return new User(1, "Egor");
        }
        if (id == 2) {
            return new User(2, "Mike");
        }
        return new User(3, "Vladimir");
    }
}