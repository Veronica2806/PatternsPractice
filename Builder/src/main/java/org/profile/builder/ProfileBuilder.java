package org.profile.builder;

import org.profile.Department;
import org.profile.Profile;

public class ProfileBuilder implements Builder {

	String role;
	Department department;

	@Override
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public void setDepartment(Department department) {
		this.department = department;
	}

	public Profile getResult() {
		return new Profile(department, role);
	}
}
