package com.globallogic.todolist.controllers;

import com.globallogic.todolist.models.Task;
import com.globallogic.todolist.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskServices taskServices;

    @RequestMapping
    public List<Task> getTasks() {
        return taskServices.getAllTasks();
    }

    @RequestMapping("/{id}")
    public Task getTask(@PathVariable(value = "id") long id) {
        return taskServices.getTask(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Task createTask(@RequestBody Task task) {
        return taskServices.createTask(task);
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
