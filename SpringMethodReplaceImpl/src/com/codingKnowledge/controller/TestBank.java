package com.codingKnowledge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.Bank;

public class TestBank {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bank b = (Bank) context.getBean("b");
		b.deposit();
		b.withdraw();
		b.calInterest();

	}
}


