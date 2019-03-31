package net.paass.spring5didemo;

import net.paass.spring5didemo.controllers.ConstructorInjectedController;
import net.paass.spring5didemo.controllers.MyController;
import net.paass.spring5didemo.controllers.PropertyInjectedController;
import net.paass.spring5didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

    // manually get bean from context
    MyController controller = (MyController) ctx.getBean("myController");
    controller.sayHello();

    // autowired on property needed
    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

    // autowired on setter method needed
    System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

    // no autowired needed
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }

}
