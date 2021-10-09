package fr.eni.TPJTodoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import fr.eni.TPJTodoList.bo.Todo;
import fr.eni.TPJTodoList.service.TodoService;

@Controller
public class TodoListController {
	
	//Lien avec couche Metiers
	@Autowired
	private TodoService service;
	public TodoListController(TodoService service) {
		this.service = service;
	}
	
	@GetMapping("/form")
	public String ajoutTodo(Model model) {
		model.addAttribute("todo", new Todo());
		return "form";
	}
	
	@PostMapping("/form")
	public String ajouterTodo(@ModelAttribute("todo") Todo todo) {
		service.ajouterTodo(todo);
		return "redirect:/todos";
	}
	
	@GetMapping({"", "/todos"})
	public String afficherListe(Model model) {
		model.addAttribute("todos", service.getTodos());
		return "todos";
	}
	
	@GetMapping("/del")
	public String suppTodo(Model model, @RequestParam Long id) {
		service.deleteTodo(id);
		return "redirect:/todos";
	}
	
	@GetMapping("/up")
	public String modifierTodo(@RequestParam Long id, Model model) {
		Todo todo = service.findTodoById(id).get();
		model.addAttribute("todo", todo);
		service.deleteTodo(id);
		return "form";
	}


}
