package org.profile;

public class Profile {
	public Department getDepartment() {
		return department;
	}

	public String getRole() {
		return role;
	}

	Department department;
	String role;

	public Profile(Department department, String role){
		this.department = department;
		this.role = role;
	}

}
