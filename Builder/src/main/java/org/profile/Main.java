package org.profile;

import org.profile.builder.ProfileBuilder;
import org.profile.director.Director;

public class Main {
	public static void main(String[] args) {
		ProfileBuilder builder = new ProfileBuilder();
		Director director = new Director();
		director.buildAdmin(builder);
		Profile profile = builder.getResult();
		System.out.println("Profile built:\n" + profile.getDepartment());
	}
}
