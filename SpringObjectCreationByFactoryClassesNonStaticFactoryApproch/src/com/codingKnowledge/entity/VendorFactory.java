package com.codingKnowledge.entity;

public class VendorFactory {

	private String projectName;

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	/* Non Static Factory Approach */

	public Vendor getInstance() throws Exception {

		Vendor vendor = (Vendor) Class.forName(projectName).newInstance();
		return vendor;
	}

}
