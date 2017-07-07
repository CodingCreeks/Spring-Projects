package com.online.spring.web.appconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {
	
	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);

}
