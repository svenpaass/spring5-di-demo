package net.paass.services;

import org.springframework.stereotype.Repository;

/**
 * Created by jt on 5/24/17.
 */
// @Repository or @Component, @Service or @Controller
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

  @Override
  public String getEnglishGreeting() {
    return "Hello - Primary Greeting service";
  }

  @Override
  public String getSpanishGreeting() {
    return "Servicio de Saludo Primario";
  }

  @Override
  public String getGermanGreeting() {

    return "Primärer Grußdienst";

  }
}
