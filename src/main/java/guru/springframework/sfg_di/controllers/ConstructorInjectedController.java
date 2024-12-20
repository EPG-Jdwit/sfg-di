package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") final GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
