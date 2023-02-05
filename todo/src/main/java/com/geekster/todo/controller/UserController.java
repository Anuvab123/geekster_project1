package com.geekster.todo.controller;

import com.geekster.todo.model.User;
import com.geekster.todo.service.UserService;
import io.micrometer.common.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/user")
    public String saveUser(@RequestBody User user){
        UserService userService = new UserService();
        String status = userService.saveUser(user);
        return status;
    }
    @GetMapping("/user")
    public String getUser(@Nullable @RequestParam String firstName){
        UserService service = new UserService();
        return service.getUser(firstName).toString();
    }
}
