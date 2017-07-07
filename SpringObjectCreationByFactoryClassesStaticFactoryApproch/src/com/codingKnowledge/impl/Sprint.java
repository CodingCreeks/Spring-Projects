package com.codingKnowledge.impl;

import com.codingKnowledge.entity.Vendor;

public class Sprint implements Vendor{

	@Override
	public void startProject() {
		System.out.println("Sprint project");
	}
}