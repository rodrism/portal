package br.com.rodrism.portal.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rodrism.portal.model.Person;
import br.com.rodrism.portal.model.PersonKey;

@Repository
public interface PersonRepository extends CassandraRepository<Person, PersonKey>{
	
	List<Person> findByKeyFirstName(String firstName);
	List<Person> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(String firstName, LocalDateTime dateOfBirth);

	
	// Don't do this!!
    @Query(allowFiltering = true)
	List<Person> findByLastName(final String lastName);

}


