package com.globallogic.todolist.models;

import javax.persistence.Entity;

@Entity
public class Task {

    private long id;
    private String content;

    public Task(String content) {
        this.id = id;
        this.content = content;
    }

    public Task() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
