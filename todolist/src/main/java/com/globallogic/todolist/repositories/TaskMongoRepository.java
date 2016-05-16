package com.globallogic.todolist.repositories;

import com.globallogic.todolist.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskMongoRepository extends MongoRepository<Task, Long>{

    Task findOne(Long id);

    List<Task> findAll();

    void delete(Task task);

    Task save(Task task);
}
