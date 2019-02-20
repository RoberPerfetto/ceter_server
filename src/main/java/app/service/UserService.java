package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.User;
import app.model.Cuenta;
import app.dao.UserRepository;

@Service
public class UserService {

	@Autowired
	protected UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
	
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
	}
/*
	public void updateUser(Long id, User user) {
		this.userRepository.deleteById(id);
	}*/
}
