package net.paass.spring5didemo.controllers;

import net.paass.spring5didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

  @Autowired
  //@Qualifier("greetingServiceImpl")
  @Qualifier("greetingServiceImpl")
  public GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
