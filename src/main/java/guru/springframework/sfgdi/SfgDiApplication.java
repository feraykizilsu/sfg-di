package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.sfgdi.services","guru.springframework.sfgdi.controllers"})
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		PropertyInjectedController propcontroller = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propcontroller.getGreeting());

		ConstructorInjectedController consController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(consController.getGreeting());

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}
