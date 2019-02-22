package ru.hh.school.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodoDTO {

    @JsonProperty(required = true)
    private long id;
    @JsonProperty(required = true)
    private String title;
    @JsonProperty(required = true)
    private boolean completed;

    public TodoDTO(long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public TodoDTO(TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.completed = todoEntity.isCompleted();
    }

    public TodoDTO() {}

    @Override
    public String toString() {
        return "{\n id: " + id + ",\n title: " + title + ",\n completed: " + completed + "\n }";
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
