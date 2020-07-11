package br.com.rodrism.portal.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.rodrism.portal.model.Person;
import br.com.rodrism.portal.model.PersonKey;
import br.com.rodrism.portal.model.Tutorial;
import br.com.rodrism.portal.repository.PersonRepository;
import br.com.rodrism.portal.repository.TutorialRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonRepository repositoryPerson;
	TutorialRepository repositoryTutorial;

	
	/*
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario verificaUser) {
		
		Usuario resultado = dao.findByRacfOrEmail(verificaUser.getRacf(), verificaUser.getEmail());
		return ResponseEntity.ok(resultado);

	}
	 */
	
	@PostMapping("/findperson")
	public ResponseEntity<List<Person>> getPerson(@RequestBody PersonKey firstName){
		
		List<Person> user = repositoryPerson.findByKeyFirstName(firstName.getFirstName());
		return ResponseEntity.ok(user);
	}
	
	/*
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
  		try {
    		Tutorial _tutorial = tutorialRepository.save(new Tutorial(UUIDs.timeBased(), tutorial.getTitle(), tutorial.getDescription(), false));
    		return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
  		} catch (Exception e) {
    		return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
  		}
	}
	*/
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Person> insertPerson(@RequestBody PersonKey pkey, Person person){
		
		System.out.println(person.toString());
		
		PersonKey pk = new PersonKey(pkey.getFirstName(), pkey.getDateOfBirth(), UUID.randomUUID());
		Person p = new Person(pk, person.getLastName(), person.getSalary());
		
		System.out.println(p.toString());
		
		repositoryPerson.save(p);
		
		return ResponseEntity.ok(p);
	}
	
	/*
	@PostMapping("/cadastrar")
	public void insertPerson(@RequestBody PersonKey pkey, Person person){
		PersonKey pk = new PersonKey(pkey.getFirstName(), pkey.getDateOfBirth(), pkey.getId());
		Person p = new Person(pk,person.getLastName(),person.getSalary());
		System.out.println(p.toString());
		repository.save(p);
			
	}
	*/

}
