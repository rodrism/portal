package br.com.rodrism.portal.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import br.com.rodrism.portal.model.Roles;

public interface RolesRepository extends CassandraRepository<Roles, String>{
	
	

}
