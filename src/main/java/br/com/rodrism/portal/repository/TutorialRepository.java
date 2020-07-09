package br.com.rodrism.portal.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import br.com.rodrism.portal.model.Tutorial;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID>{

	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);

}
