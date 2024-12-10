package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.ConstructorGreetingService;
import guru.springframework.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	private final ConstructorGreetingService constructorGreetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") final GreetingService greetingService, ConstructorGreetingService constructorGreetingService) {
		this.greetingService = greetingService;
		this.constructorGreetingService = constructorGreetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
