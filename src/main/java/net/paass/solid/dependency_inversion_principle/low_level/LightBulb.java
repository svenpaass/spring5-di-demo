package net.paass.solid.dependency_inversion_principle.low_level;

import net.paass.solid.dependency_inversion_principle.high_level.Switchable;

public class LightBulb implements Switchable {

  @Override
  public void turnOn() {
    System.out.println("LightBulb: Bulb turned on...");
  }

  @Override
  public void turnOff() {
    System.out.println("LightBulb: Bulb turned off...");
  }
}
