package br.com.rodrism.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrism.portal.model.Keyspace;
import br.com.rodrism.portal.repository.KeyspaceRepository;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class KeyspaceController {
	
	@Autowired
	KeyspaceRepository keyspaceRepository;
	
	@GetMapping("/keyspaces")
	public List<Keyspace>  listaKeyspaces() {
		
		List<Keyspace> keyspaces;
		
		keyspaces = keyspaceRepository.findAll();
		
		return keyspaces;
	}
	
}
