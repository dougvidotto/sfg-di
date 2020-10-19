package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.yaml.snakeyaml.constructor.SafeConstructor;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("------------ Profile");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("------------ Primary");

		System.out.println(controller.sayHello());

		System.out.println("------------ Property");

		PropertyInjectionController propController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propController.getGreeting());

		System.out.println("------------ Setter");

		SetterInjectionController setterController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterController.getGreeting());

		System.out.println("------------ Constructor");
		ConstructorInjectionController constructorController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorController.getGreeting());
	}
}
