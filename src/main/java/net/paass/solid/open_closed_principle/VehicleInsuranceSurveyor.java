package net.paass.solid.open_closed_principle;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {

  @Override
  public boolean isValidClaim() {
    System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
    /*Logic to validate vehicle insurance claims*/
    return true;
  }
}
