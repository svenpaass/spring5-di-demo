package net.paass.spring5didemo.controllers;

import net.paass.spring5didemo.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

}
