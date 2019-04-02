package net.paass.solid.liskov_substitution_principle;

public class TransportationDevice {

  String name;
  String getName() { return name; }
  void setName(String n) { name = n; }

  double speed;
  double getSpeed() { return speed; }
  void setSpeed(double d) { speed = d; }

}
