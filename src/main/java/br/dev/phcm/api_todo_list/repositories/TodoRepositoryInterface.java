package br.dev.phcm.api_todo_list.repositories;

import br.dev.phcm.api_todo_list.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositoryInterface extends JpaRepository<Todo, Long> {

}
