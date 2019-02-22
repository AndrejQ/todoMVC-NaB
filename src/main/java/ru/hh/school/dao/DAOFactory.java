package ru.hh.school.dao;

import ru.hh.school.model.TodoEntity;

public class DAOFactory {
    private static final TodoDAO todoDAO = new TodoDAO();

    public static TodoDAO getTodoDAO() {
        return todoDAO;
    }

    public void generateTodos() {
        TodoEntity t1 = new TodoEntity(1L, "hey1", false);
        TodoEntity t2 = new TodoEntity(2L, "hey2", false);
        TodoEntity t3 = new TodoEntity(3L, "hey3", false);
        todoDAO.isnertTodo(t1);
        todoDAO.isnertTodo(t2);
        todoDAO.isnertTodo(t3);
    }
}
