package net.paass.solid.open_closed_principle.bad_example;

public class ClaimApprovalManager {
  public void processHealthClaim (HealthInsuranceSurveyor surveyor)
  {
    if(surveyor.isValidClaim()){
      System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }

  // bad: need to extend the class for new functionality
  public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)
  {
    if(surveyor.isValidClaim()){
      System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }
}
