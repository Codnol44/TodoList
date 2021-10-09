package fr.eni.TPJTodoList.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import fr.eni.TPJTodoList.bo.Lieu;
import fr.eni.TPJTodoList.service.TodoService;

public class TodoListContextApplication {

	private TodoService todoService;
	private List<Lieu> lieux;

	
	@Autowired
	public TodoListContextApplication(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<Lieu> getLieux() {
		if(this.lieux == null) {
			lieux = todoService.getLieux();
		}
		return lieux;
	}

//	public void setBases(List<Lieu> lieux) {
//		this.lieux = lieux;
//	}
	
}
