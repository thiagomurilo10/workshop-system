package br.com.apolo.WorkShop.repositories;

import br.com.apolo.WorkShop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
