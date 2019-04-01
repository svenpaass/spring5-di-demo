package net.paass.spring5didemo.controllers;

import net.paass.spring5didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  private GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String hello(){
    System.out.println("Hello!!! ");

    return greetingService.sayGreeting();
  }

}
