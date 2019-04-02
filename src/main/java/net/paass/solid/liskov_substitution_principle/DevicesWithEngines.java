package net.paass.solid.liskov_substitution_principle;

import net.paass.solid.liskov_substitution_principle.bad_example.Engine;

public class DevicesWithEngines extends TransportationDevice {

  Engine engine;
  Engine getEngine() { return engine; }
  void setEngine(Engine e) { engine = e; }

  void startEngine() { engine.startEngine(); }

}
