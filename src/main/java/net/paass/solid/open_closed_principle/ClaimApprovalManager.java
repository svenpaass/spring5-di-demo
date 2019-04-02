package net.paass.solid.open_closed_principle;

public class ClaimApprovalManager {

  public void processClaim(InsuranceSurveyor surveyor) {
    if ( surveyor.isValidClaim() ) {
      System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
    }
  }

}
