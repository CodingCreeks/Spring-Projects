package com.codingKnowledge.controller;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.Client;

public class TestClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Client client1 = (Client) context.getBean("cl");
		Client client2 = (Client) context.getBean("cl");
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println("\nIs Client is Singleton ? : "+(client1==client2));
		
		Calendar c1 = (Calendar) context.getBean("ca");
		Calendar c2 = (Calendar) context.getBean("ca");
		
		System.out.println("\n"+c1);
		System.out.println(c2);
		System.out.println("\nIs Calendar is Singleton ? : "+(c1==c2));
		System.out.println(c1.getCalendarType());

	}
}
