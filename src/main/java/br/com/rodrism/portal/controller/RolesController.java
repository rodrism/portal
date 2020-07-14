package br.com.rodrism.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrism.portal.model.Roles;
import br.com.rodrism.portal.repository.RolesRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RolesController {
	
	@Autowired
	RolesRepository rolesRepository;
	
	
	@GetMapping("/roles")
	public List<Roles> listAllRoles(){
		
		List<Roles> lista = rolesRepository.findAll();
		
		return lista;
	}

}
