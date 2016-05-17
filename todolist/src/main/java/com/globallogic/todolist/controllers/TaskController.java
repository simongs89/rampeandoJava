package com.globallogic.todolist.controllers;

import com.globallogic.todolist.models.Task;
import com.globallogic.todolist.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{nickName}/tasks")
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    @RequestMapping
    public List<Task> getTasks(@PathVariable(value = "nickName") String nickName) {
        return taskServices.getTasksByUser(nickName);
    }

    @RequestMapping("/{id}")
    public Task getTask(@PathVariable(value = "id") long id) {
        return taskServices.getTask(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Task createTask(@PathVariable(value = "nickName") String nickName, @RequestBody Task task) {
        return taskServices.createTask(nickName, task);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Task updateTask(@PathVariable(value = "id") long id, @RequestBody Task task) {
        return taskServices.updateTask(id, task);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTask(@PathVariable(value = "id") long id) {
        taskServices.deleteTask(id);
    }

}
