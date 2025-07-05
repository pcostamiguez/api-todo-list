package br.dev.phcm.api_todo_list.controllers;

import br.dev.phcm.api_todo_list.entities.Todo;
import br.dev.phcm.api_todo_list.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("{id}")
    Optional<Todo> show(@PathVariable Long id) {
        return todoService.show(id);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id) {
        return todoService.delete(id);
    }
}
