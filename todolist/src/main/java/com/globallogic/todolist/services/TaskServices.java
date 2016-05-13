package com.globallogic.todolist.services;

import com.globallogic.todolist.models.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServices {

    private List<Task> taskList = new ArrayList<>();

    public TaskServices() {
        taskList.add(new Task("name"));
        taskList.add(new Task("name"));
        taskList.add(new Task("name"));
    }

    public List<Task> getAllTasks() {
        return taskList;
    }

    public Task getTask(long id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void deleteTask(long id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                taskList.remove(task);
                return;
            }
        }
    }

    public Task createTask(Task t) {
        Task task = new Task(t.getContent());
        taskList.add(task);
        return task;
    }

    public Task updateTask(long id, Task t) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.setContent(t.getContent());
                return task;
            }
        }
        return null;
    }
}
