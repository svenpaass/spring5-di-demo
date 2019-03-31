package net.paass.spring5didemo.controllers;

import net.paass.spring5didemo.services.GreetingService;

public class ConstructorInjectedController {

  private GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  String sayHello() {
    return greetingService.sayGreeting();
  }

}
