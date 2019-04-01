package net.paass.spring5didemo.controllers;

import static org.junit.Assert.assertEquals;

import net.paass.spring5didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}