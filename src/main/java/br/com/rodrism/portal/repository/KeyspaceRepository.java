package br.com.rodrism.portal.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import br.com.rodrism.portal.model.Keyspaces;

public interface KeyspaceRepository extends CassandraRepository<Keyspaces, Integer>{
	
	

}
