package br.com.rodrism.portal.model;

import java.util.Map;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@EntityScan
@Table
public class Keyspaces  {
	
	@PrimaryKey
	public String keyspace_name;
	
	public Boolean durable_writes;
	public Map<String, String> replication;
		
	public Keyspaces(String keyspace_name, Boolean durable_writes, Map<String, String> replication) {
		this.keyspace_name = keyspace_name;
		this.durable_writes = durable_writes;
		this.replication = replication;
	}
	
	
	public String getKeyspace_name() {
		return keyspace_name;
	}
	public void setKeyspace_name(String keyspace_name) {
		this.keyspace_name = keyspace_name;
	}
	public Boolean getDurable_writes() {
		return durable_writes;
	}
	public void setDurable_writes(Boolean durable_writes) {
		this.durable_writes = durable_writes;
	}
	public Map<String, String> getReplication() {
		return replication;
	}
	public void setReplication(Map<String, String> replication) {
		this.replication = replication;
	}
	
	
}
