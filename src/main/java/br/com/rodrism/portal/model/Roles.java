package br.com.rodrism.portal.model;

import java.util.Set;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Roles {
	
	@PrimaryKey
	String role;
	
	@Column("can_login")
	Boolean	canLogin;
	
	@Column("is_superuser")
	Boolean isSuperUser;
	
	@Column("member_of")
	Set<String> memberOf;
	
	public Roles(String role, Boolean canLogin, Boolean isSuperUser, Set<String> memberOf) {
		this.role = role;
		this.canLogin = canLogin;
		this.isSuperUser = isSuperUser;
		this.memberOf = memberOf;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getCanLogin() {
		return canLogin;
	}

	public void setCanLogin(Boolean canLogin) {
		this.canLogin = canLogin;
	}

	public Boolean getIsSuperUser() {
		return isSuperUser;
	}

	public void setIsSuperUser(Boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	public Set<String> getMemberOf() {
		return memberOf;
	}

	public void setMemberOf(Set<String> memberOf) {
		this.memberOf = memberOf;
	}

	@Override
	public String toString() {
		return "Roles [role=" + role + ", canLogin=" + canLogin + ", isSuperUser=" + isSuperUser + ", memberOf="
				+ memberOf + "]";
	}
	
	
	
}
