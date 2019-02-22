package ru.hh.school.service;

import ru.hh.school.dao.DAOFactory;
import ru.hh.school.model.TodoEntity;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private DAOFactory daoFactory = new DAOFactory();

    public List<TodoEntity> getAllTodos() {
        ArrayList<TodoEntity> list = daoFactory.getTodoDAO().getAllTodos();
        return list;
    }

    public TodoEntity getTodo(long id) {
        return daoFactory.getTodoDAO().getTodoById(id);
    }

    public Response createTodo(TodoEntity todo) {
        daoFactory.getTodoDAO().isnertTodo(todo);
        return Response.ok().build();
    }

    public void deleteTodo(long id) {
        daoFactory.getTodoDAO().deleteTodo(id);
    }

    public void updateTodo(long id, TodoEntity item) {
        daoFactory.getTodoDAO().updateTodo(id, item);
    }

    public void deleteAllTodo() {
        daoFactory.getTodoDAO().deleteAll();
    }
}
