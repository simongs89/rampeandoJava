package com.globallogic.todolist.services;

import com.globallogic.todolist.models.Task;
import com.globallogic.todolist.models.User;
import com.globallogic.todolist.repositories.TaskMongoRepository;
import com.globallogic.todolist.repositories.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TaskServices {

    @Autowired
    private UserMongoRepository userRepository;

    @Autowired
    private TaskMongoRepository taskRepository;

    public List<Task> getTasksByUser(String nickName) {
        User user = userRepository.findByNickName(nickName);
        return user.getTasks();
    }

    public Task getTask(long id) {
        return taskRepository.findOne(id);
    }

    public void deleteTask(long id) {
        taskRepository.delete(taskRepository.findOne(id));
    }

    public Task createTask(String nickName, Task task) {
        User user = userRepository.findByNickName(nickName);
        task.setId((new Date()).getTime());
        //task = taskRepository.save(task);
        user.getTasks().add(task);
        userRepository.save(user);
        return task;
    }

    public Task updateTask(long id, Task task) {
        //Task t = taskRepository.findOne(id);
       // t.setContent(task.getContent());
       // return taskRepository.save(t);
        return null;
    }

}
