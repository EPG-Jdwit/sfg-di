package guru.springframework.sfg_di;

import guru.springframework.sfg_di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);

		myController.sayHello();
		System.out.println(myController.sayHello());
	}

}
