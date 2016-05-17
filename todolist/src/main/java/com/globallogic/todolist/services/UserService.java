package com.globallogic.todolist.services;

import com.globallogic.todolist.models.User;
import com.globallogic.todolist.repositories.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMongoRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(String nickName) {
        return userRepository.findByNickName(nickName);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
