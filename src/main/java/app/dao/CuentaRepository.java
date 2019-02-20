package app.dao;

import org.springframework.data.repository.CrudRepository;

import app.model.Cuenta;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CuentaRepository extends CrudRepository<Cuenta, Long> {

}
