package guru.springframework.sfg_di;

import guru.springframework.sfg_di.controllers.ConstructorInjectedController;
import guru.springframework.sfg_di.controllers.I18nController;
import guru.springframework.sfg_di.controllers.MyController;
import guru.springframework.sfg_di.controllers.PropertyInjectedController;
import guru.springframework.sfg_di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayGreeting());

		MyController myController = ctx.getBean(MyController.class);

		System.out.println(myController.sayHello());

		System.out.println("---- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
