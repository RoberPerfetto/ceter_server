package app.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import app.model.User;
import app.model.Cuenta;
import app.service.UserService;
import app.service.CuentaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/count")
public class CuentaController {

	@Autowired
	private CuentaService cuentaService;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Cuenta> getAllCuentas() {
		return cuentaService.findAll();
	}

	@GetMapping(path="/{id}")
    	public @ResponseBody Optional<Cuenta> findById(@PathVariable("id") Long id) {
        	return cuentaService.findById(id);
    	}
}
