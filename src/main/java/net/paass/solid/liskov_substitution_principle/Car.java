package net.paass.solid.liskov_substitution_principle;

public class Car extends DevicesWithEngines {

  @Override
  void startEngine() {
    System.out.println("Car: Start Engine");
  }
}
