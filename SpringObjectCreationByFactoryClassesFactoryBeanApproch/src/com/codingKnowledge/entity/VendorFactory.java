package com.codingKnowledge.entity;

import org.springframework.beans.factory.FactoryBean;

public class VendorFactory implements FactoryBean<Object> {

	private String vendorName;

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public Vendor getObject() throws Exception {
		Vendor vendor = (Vendor) Class.forName(vendorName).newInstance();
		return vendor;
	}

	@Override
	public Class<Vendor> getObjectType() {
		return Vendor.class;
	}

	/* return 'true' for singleton classes, 'false' to prototype classes */
	@Override
	public boolean isSingleton() {
		return true;
	}

}
