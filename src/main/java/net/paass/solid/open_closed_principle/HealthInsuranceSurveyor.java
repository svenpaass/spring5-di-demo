package net.paass.solid.open_closed_principle;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

  @Override
  public boolean isValidClaim() {
    System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
    /*Logic to validate health insurance claims*/
    return true;
  }
}
