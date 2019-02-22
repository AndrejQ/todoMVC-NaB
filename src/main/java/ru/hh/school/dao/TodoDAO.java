package ru.hh.school.dao;


import ru.hh.school.model.TodoEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TodoDAO {
    private Map<Long, TodoEntity> todoIdMap = new HashMap<Long, TodoEntity>();

    public TodoEntity getTodoById(long id) {
         return todoIdMap.get(id);
    }

    public ArrayList<TodoEntity> getAllTodos() {
        return new ArrayList<TodoEntity>(todoIdMap.values());
    }

    public void isnertTodo(TodoEntity todo) {
        todoIdMap.put(todo.getId(), todo);
    }

    public void updateTodo(Long id, TodoEntity newTodo) {
        todoIdMap.put(id, newTodo);
    }

    public void deleteTodo(long id) {
        todoIdMap.remove(id);
    }

    public void deleteAll() {
        todoIdMap.clear();
    }
}
