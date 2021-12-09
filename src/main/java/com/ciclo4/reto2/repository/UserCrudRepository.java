package com.ciclo4.reto2.repository;


import com.ciclo4.reto2.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jorge Quesada
 */

public interface UserCrudRepository extends MongoRepository<User, Integer> {
    
    public Optional<User> findByEmailAndPassword(String email, String password);

    public Optional<User> findByEmail(String email);
  
}
