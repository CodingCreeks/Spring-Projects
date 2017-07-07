package com.codingKnowledge.entity;

public class Client {

	private static Client client;

	private Client() {
		System.out.println("Client Object");
	}

	public static Client getInstance() {
		if (client == null) {
			client = new Client();
			return client;
		} else {
			return client;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
