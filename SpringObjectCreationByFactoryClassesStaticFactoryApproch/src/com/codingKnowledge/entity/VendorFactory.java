package com.codingKnowledge.entity;

public class VendorFactory {

	private static String projectName;

	public static void setProjectName(String projectName) {
		VendorFactory.projectName = projectName;
	}
	
	/* Static Factory Approach */

	public static Vendor getInstance() throws Exception {

		Vendor vendor = (Vendor) Class.forName(projectName).newInstance();
		return vendor;
	}

}
