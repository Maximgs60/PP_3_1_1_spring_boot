package web.spring.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.spring.spring_boot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
