package net.paass.spring5didemo.controllers;

import static org.junit.Assert.assertEquals;

import net.paass.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

  private SetterInjectedController setterInjectedController;

  @Before
  public void setUp() throws Exception {
    this.setterInjectedController = new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
  }
}
