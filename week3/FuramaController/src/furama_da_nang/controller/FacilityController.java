package furama_da_nang.controller;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.Villa;
import furama_da_nang.service.FacilityService;
import furama_da_nang.service.IFacilityService;
import java.util.Map;

public class FacilityController {
  private IFacilityService iFacilityService = new FacilityService();

  public Map<Facility, Integer> displayListFacility() {
    return iFacilityService.displayListFacility();
  }


  public void addService(Facility facility) {
    iFacilityService.addService(facility);
  }

  public Facility checkDeleteFacility(String idFacility) {
    return iFacilityService.checkDeleteFacility(idFacility);
  }

  public void deleteFacility(String idFacility) {
    iFacilityService.deleteFacility(idFacility);
  }
}
