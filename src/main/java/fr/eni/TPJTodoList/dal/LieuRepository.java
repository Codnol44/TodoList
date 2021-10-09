package fr.eni.TPJTodoList.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.eni.TPJTodoList.bo.Lieu;
import fr.eni.TPJTodoList.bo.Todo;

public interface LieuRepository extends JpaRepository<Lieu, Long> {

}
