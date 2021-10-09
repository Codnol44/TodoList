package fr.eni.TPJTodoList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import fr.eni.TPJTodoList.bo.Lieu;
import fr.eni.TPJTodoList.controller.TodoListContextApplication;
import fr.eni.TPJTodoList.dal.LieuRepository;
import fr.eni.TPJTodoList.service.TodoService;

@SpringBootApplication
public class TpTodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpTodoListApplication.class, args);
	}
	
	@Bean
	public TodoListContextApplication todoListContextApplication(TodoService todoService) {
		return new TodoListContextApplication(todoService);
	}

	@Bean
	public CommandLineRunner initLieu(LieuRepository lieuRepo ) {
		return (args) -> {
			lieuRepo.save(new Lieu("A l'appart"));
			lieuRepo.save(new Lieu("Dans le centre-ville"));
			lieuRepo.save(new Lieu("Avec les pongistes"));
			lieuRepo.save(new Lieu("Chez Flo ou Ben"));
			lieuRepo.save(new Lieu("Dans un parc"));
			lieuRepo.save(new Lieu("Dans un lieu dédié à cette activité"));
		};
	}
	
}
