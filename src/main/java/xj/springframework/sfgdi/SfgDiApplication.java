package xj.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import xj.springframework.sfgdi.controllers.ConstructorInjectedController;
import xj.springframework.sfgdi.controllers.I18nController;
import xj.springframework.sfgdi.controllers.MyController;
import xj.springframework.sfgdi.controllers.PropertyInjectedController;
import xj.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext cac = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) cac.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) cac.getBean("myController");

		System.out.println("----- primary bean");
		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("-------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) cac.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) cac.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) cac.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
