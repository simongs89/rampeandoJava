package com.globallogic.todolist.repositories;

import com.globallogic.todolist.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMongoRepository extends MongoRepository<User, Long> {

    User findByNickName(String nickName);

    List<User> findAll();

    User save(User user);
}
