package ru.hh.school.model;

public class TodoEntity {

    private long id;
    private String title;
    private boolean completed;

    public TodoEntity(long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public TodoEntity(TodoDTO todoDTO) {
        this.id = todoDTO.getId();
        this.title = todoDTO.getTitle();
        this.completed = todoDTO.isCompleted();
    }

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
