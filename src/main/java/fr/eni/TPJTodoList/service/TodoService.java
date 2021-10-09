package fr.eni.TPJTodoList.service;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;
import fr.eni.TPJTodoList.bo.Lieu;
import fr.eni.TPJTodoList.bo.Todo;

public interface TodoService {
	
	void ajouterTodo(Todo todo);
	
	public List<Todo> getTodos() ;

	Optional<Todo> findTodoById(Long id);

	void deleteTodo(Long id);
	
	public List<Lieu> getLieux();
	
}
