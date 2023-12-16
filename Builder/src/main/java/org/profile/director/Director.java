package org.profile.director;

import org.profile.builder.Builder;
import org.profile.Department;

public class Director {
	public void buildAdmin(Builder builder) {
		builder.setDepartment(Department.RnD);
		builder.setRole("Automation QA");
	}
}
