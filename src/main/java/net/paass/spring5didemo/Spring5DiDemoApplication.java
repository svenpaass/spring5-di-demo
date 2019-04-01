package net.paass.spring5didemo;

import net.paass.spring5didemo.controllers.ConstructorInjectedController;
import net.paass.spring5didemo.controllers.GetterInjectedController;
import net.paass.spring5didemo.controllers.MyController;
import net.paass.spring5didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

    MyController controller = (MyController) ctx.getBean("myController");

    System.out.println(controller.hello());
    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
