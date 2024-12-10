package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setGreetingService() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}