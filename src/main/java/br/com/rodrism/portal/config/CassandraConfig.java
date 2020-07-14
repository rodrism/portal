package br.com.rodrism.portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;


//@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration{

	@Override
	protected String getKeyspaceName() {
		// TODO Auto-generated method stub
		return "portal";
	}

	public String getContactPoints() {
		return "192.168.0.14";
	}

}