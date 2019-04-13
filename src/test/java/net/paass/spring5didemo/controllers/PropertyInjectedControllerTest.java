package net.paass.spring5didemo.controllers;

import static org.junit.Assert.assertEquals;

import net.paass.spring5didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

  private PropertyInjectedController propertyInjectedController;

  @Before
  public void setUp() throws Exception {
    this.propertyInjectedController = new PropertyInjectedController();
    this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
  }
}
