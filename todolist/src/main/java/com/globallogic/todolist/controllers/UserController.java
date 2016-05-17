package com.globallogic.todolist.controllers;

import com.globallogic.todolist.models.User;
import com.globallogic.todolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @RequestMapping("/{nickName}")
    public User getUser(@PathVariable(value = "nickName") String nickName) {
        return service.getUser(nickName);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

}
