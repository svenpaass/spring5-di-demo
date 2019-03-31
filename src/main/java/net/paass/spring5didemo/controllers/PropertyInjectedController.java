package net.paass.spring5didemo.controllers;

import net.paass.spring5didemo.services.GreetingService;

public class PropertyInjectedController {

  public GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
