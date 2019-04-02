package net.paass.solid.dependency_inversion_principle;

import net.paass.solid.dependency_inversion_principle.high_level.ElectricPowerSwitch;
import net.paass.solid.dependency_inversion_principle.high_level.Switch;
import net.paass.solid.dependency_inversion_principle.high_level.Switchable;
import net.paass.solid.dependency_inversion_principle.low_level.Fan;
import net.paass.solid.dependency_inversion_principle.low_level.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {

  @Test
  public void testPress() throws Exception {
    Switchable switchableBulb = new LightBulb();
    Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
    bulbPowerSwitch.press();
    bulbPowerSwitch.press();

    Switchable switchableFan = new Fan();
    Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
    fanPowerSwitch.press();
    fanPowerSwitch.press();
  }

}
