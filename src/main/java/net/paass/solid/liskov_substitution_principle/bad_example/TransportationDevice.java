package net.paass.solid.liskov_substitution_principle.bad_example;

public class TransportationDevice {

  String name;
  String getName() { return name; }
  void setName(String n) { name = n; }

  double speed;
  double getSpeed() { return speed; }
  void setSpeed(double d) { speed = d; }

  Engine engine;
  Engine getEngine() { return engine; }
  void setEngine(Engine e) { engine = e; }

  void startEngine() { }

}
