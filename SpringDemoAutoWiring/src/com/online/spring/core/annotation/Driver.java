package com.online.spring.core.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	String cardriver;

	public Driver() {
	}

	@Value("SupercarDriver")
	public void setCardriver(String cardriver) {
		this.cardriver = cardriver;
	}

	public void printDriver() {
		System.out.println(cardriver);
	}

}
