package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.User;
import app.model.Cuenta;
import app.dao.CuentaRepository;

@Service
public class CuentaService {

	@Autowired
	protected CuentaRepository cuentaRepository;

	public Cuenta save(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}

	public Optional<Cuenta> findById(Long id) {
		return cuentaRepository.findById(id);
	}

	public Iterable<Cuenta> findAll() {
		return cuentaRepository.findAll();
	}

	public void deleteCuenta(Long id) {
		this.cuentaRepository.deleteById(id);
	}

}
