package fr.eni.TPJTodoList.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.eni.TPJTodoList.bo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
