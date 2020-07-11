package br.com.rodrism.portal.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrism.portal.model.Keyspaces;
import br.com.rodrism.portal.repository.KeyspaceRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class KeyspaceController {
	
	KeyspaceRepository keyspaceRepository;
	
	
	@GetMapping("/keyspaces")
	public ResponseEntity<List<Keyspaces>> findAll(){
		
		List<Keyspaces> keyspaces;
		
		keyspaces = keyspaceRepository.findAll();

		return ResponseEntity.ok(keyspaces);
	}

}
