package net.paass.spring5didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  public static final String HELLO = "Hello!";

  @Override
  public String sayGreeting() {
    return HELLO;
  }
}
