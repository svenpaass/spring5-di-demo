package net.paass.spring5didemo;

import net.paass.spring5didemo.controllers.MyController;
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
  }

}
