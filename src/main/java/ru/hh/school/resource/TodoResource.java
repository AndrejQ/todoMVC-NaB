package ru.hh.school.resource;

import ru.hh.school.model.TodoDTO;
import ru.hh.school.model.TodoEntity;
import ru.hh.school.service.TodoService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    private TodoService service = new TodoService();

    @GET
    @Path("/all")
    public List<TodoDTO> getAllTodos() {
        return  service.getAllTodos().stream().map(TodoDTO::new).collect(Collectors.toList());
    }

    @GET
    @Path("/getTodo/{id}")
    public TodoDTO getTodo(@PathParam("id") long id) {
        return new TodoDTO(service.getTodo(id));
    }

    @POST
    @Path("/create")
    public Response createTodo(TodoDTO todo) {
        return service.createTodo(new TodoEntity(todo));
    }

    @DELETE
    @Path("/{id}")
    public void deleteTodo(@PathParam("id") long id) {
        service.deleteTodo(id);
    }

    @PUT
    @Path("/{id}")
    public void updateTodo(@PathParam("id") long id, TodoDTO todo) {
        service.updateTodo(id, new TodoEntity(todo));
    }

    @DELETE
    @Path("/drop")
    public void deleteAllTodo() {
        service.deleteAllTodo();
    }
}
