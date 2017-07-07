package com.codingKnowledge.entity;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInterest implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("New CalInterrest class Calculate New Interest implimentation method.....");

		return obj;
	}
}