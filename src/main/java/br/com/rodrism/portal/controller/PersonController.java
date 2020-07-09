package br.com.rodrism.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrism.portal.model.Person;
import br.com.rodrism.portal.repository.PersonRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonRepository repository;

	@PostMapping("/person")
	public ResponseEntity<Person> insertPerson(@RequestBody Person pessoa){
		
		Person p = new Person(pessoa.getKey(), pessoa.getLastName(), pessoa.getSalary());
		System.out.println(pessoa.toString());
		repository.save(p);
		System.out.println(pessoa.toString());
		
		return ResponseEntity.ok(pessoa);
	}
	
	

}
