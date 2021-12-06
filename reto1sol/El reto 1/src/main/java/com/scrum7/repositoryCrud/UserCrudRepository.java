package com.scrum7.repositoryCrud;

import com.scrum7.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *RETO 1 MISION TIC 2022
 */

public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User>findByEmailAndPassword(String email, String password);

}
