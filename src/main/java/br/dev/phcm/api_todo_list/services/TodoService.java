package br.dev.phcm.api_todo_list.services;

import br.dev.phcm.api_todo_list.entities.Todo;
import br.dev.phcm.api_todo_list.repositories.TodoRepositoryInterface;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepositoryInterface todoRepository;

    public TodoService(TodoRepositoryInterface todoRepository){
        this.todoRepository = todoRepository;
    }

    public Optional<Todo> show(Long id){
        return todoRepository.findById(id);
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending()
                .and(Sort.by("nome").ascending());

        return todoRepository.findAll(sort);
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> update(Todo todo){
        Todo obj = todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
