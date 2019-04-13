package net.paass.spring5didemo;

import net.paass.spring5didemo.controllers.MyController;
import net.paass.spring5didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"net.paass.spring5didemo.services", "net.paass.spring5didemo" })
public class Spring5DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

    // manually get bean from context
    MyController controller = (MyController) ctx.getBean("myController");

    FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
    System.out.println("Properties: " + fakeDataSource);
  }

}
