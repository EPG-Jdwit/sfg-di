package guru.springframework.sfg_di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.sfg_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setGreetingService() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}