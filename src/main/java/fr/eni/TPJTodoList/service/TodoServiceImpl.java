package fr.eni.TPJTodoList.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.eni.TPJTodoList.bo.Lieu;
import fr.eni.TPJTodoList.bo.Todo;
import fr.eni.TPJTodoList.dal.LieuRepository;
import fr.eni.TPJTodoList.dal.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	//Lien avec couche DAL
	@Autowired
	private TodoRepository todoRepo;
	private LieuRepository lieuRepo;
	
	public TodoServiceImpl(TodoRepository todoRepo, LieuRepository lieuRepo) {
		this.todoRepo = todoRepo;
		this.lieuRepo = lieuRepo;
	}
	
	@Override
	public void ajouterTodo(Todo todo) {
		todoRepo.save(todo);
	}

	@Override
	public List<Todo> getTodos() {
		return todoRepo.findAll();
	}
	
	@Override
	public Optional<Todo> findTodoById(Long id) {
		return todoRepo.findById(id);
	}
	
	@Override
	public void deleteTodo(Long id) {
		todoRepo.deleteById(id);
	}
	
	//Ajout du lieu prévu
	@Override
	public List<Lieu> getLieux() {
		return lieuRepo.findAll();
	}

}
