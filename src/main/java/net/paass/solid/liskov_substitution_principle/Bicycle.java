package net.paass.solid.liskov_substitution_principle;

public class Bicycle extends DevicesWithoutEngines {

  @Override
  void startMoving() {
    System.out.println("Bicycle: Start moving.");
  }
}
