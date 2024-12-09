package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(final GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
