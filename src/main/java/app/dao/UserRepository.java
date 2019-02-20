package app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import app.model.User;
import app.model.Cuenta;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@CrossOrigin(origins = "*", maxAge = 3600)
public interface UserRepository extends CrudRepository<User, Long> {

}
