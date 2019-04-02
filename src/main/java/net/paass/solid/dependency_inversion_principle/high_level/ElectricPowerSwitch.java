package net.paass.solid.dependency_inversion_principle.high_level;

public class ElectricPowerSwitch implements Switch {

  private Switchable client;
  private boolean on;

  public ElectricPowerSwitch(Switchable client) {
    this.client = client;
    this.on = false;
  }

  @Override
  public boolean isOn() {
    return on;
  }

  @Override
  public void press() {
    boolean checkOn = isOn();
    if ( checkOn ) {
      client.turnOff();
      this.on = false;
    }
    else {
      client.turnOn();
      this.on = true;
    }

  }
}
