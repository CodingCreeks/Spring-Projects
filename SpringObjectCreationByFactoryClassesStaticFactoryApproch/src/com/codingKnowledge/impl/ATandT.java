package com.codingKnowledge.impl;

import com.codingKnowledge.entity.Vendor;

public class ATandT implements Vendor{

	@Override
	public void startProject() {
		System.out.println("AT&T project");
	}
}