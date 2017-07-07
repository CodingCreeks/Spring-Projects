package com.codingKnowledge.controller;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codingKnowledge.entity.ConnectionPool;

public class TestClient {
	private static Scanner sc = null;

	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");

		while (true) {
			sc = new Scanner(System.in);
			System.out.println("Enter 1 to 'Save' or 2 to 'Close'....");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				ConnectionPool c = (ConnectionPool) cap.getBean("cp");
				System.out.println("Enter the Client Id:");
				int id = sc.nextInt();
				System.out.println("Enter the Client Name:");
				String name = sc.next();
				System.out.println("Enter the Client Gender:");
				String gender = sc.next();
				System.out.println("Enter the Client Address:");
				String address = sc.next();
				c.save(id, name, gender, address);
				break;
			default:
				cap.close();
				break;
			}
		}
	}
}
