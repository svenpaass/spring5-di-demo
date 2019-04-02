package net.paass.solid.liskov_substitution_principle.bad_example;

public class Car extends TransportationDevice {

  @Override
  void startEngine() {
    engine.startEngine();
  }

}
