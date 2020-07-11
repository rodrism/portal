package br.com.rodrism.portal.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@EntityScan
@Table("tbl_people")
public class Person {
	
	@PrimaryKey
	private PersonKey key;
	
	@Column("last_name")
	private String lastName;
	
	@Column("salary")
	private double salary;
	
	
	public Person(PersonKey key, String lastName, double salary) {
		this.key = key;
		this.lastName = lastName;
		this.salary = salary;
	}


	public PersonKey getKey() {
		return key;
	}


	public void setKey(PersonKey key) {
		this.key = key;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
