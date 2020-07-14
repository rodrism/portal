package br.com.rodrism.portal.model;

import java.util.HashMap;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("keyspaces")
public class Keyspace {

	@PrimaryKey
	String keyspace_name;
	HashMap<String, Object> replication;
	
	
	public Keyspace(String keyspace_name, HashMap<String, Object> replication) {
		this.keyspace_name = keyspace_name;
		this.replication = replication;
	}
	
	public String getKeyspace_name() {
		return keyspace_name;
	}
	public void setKeyspace_name(String keyspace_name) {
		this.keyspace_name = keyspace_name;
	}
	public HashMap<String, Object> getReplication() {
		return replication;
	}
	public void setReplication(HashMap<String, Object> replication) {
		this.replication = replication;
	}

	@Override
	public String toString() {
		return "Keyspace [keyspace_name=" + keyspace_name + ", replication=" + replication + "]";
	}	
	
}
