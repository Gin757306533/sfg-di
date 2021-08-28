package xj.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import xj.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext cac = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) cac.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);


	}

}
