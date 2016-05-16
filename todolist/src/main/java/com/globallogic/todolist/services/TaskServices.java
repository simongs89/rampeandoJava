package com.globallogic.todolist.services;

import com.globallogic.todolist.models.Task;
import com.globallogic.todolist.repositories.TaskMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TaskServices {

    @Autowired
    private TaskMongoRepository taskRepository;


    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(long id) {
        return taskRepository.findOne(id);
    }

    public void deleteTask(long id) {
        taskRepository.delete(taskRepository.findOne(id));
    }

    public Task createTask(Task task) {
        task.setId((new Date()).getTime());
        return taskRepository.save(task);
    }

    public Task updateTask(long id, Task task) {
        Task t = taskRepository.findOne(id);
        t.setContent(task.getContent());
        return taskRepository.save(t);
    }
}
