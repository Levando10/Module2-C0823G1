package furama_da_nang.service;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.Villa;
import furama_da_nang.repository.FacilityRepository;
import furama_da_nang.repository.IFacilityRepository;
import java.util.Map;

public class FacilityService implements IFacilityService{
  private IFacilityRepository iFacilityRepository = new FacilityRepository();

  @Override
  public Map<Facility, Integer> displayListFacility() {
    return iFacilityRepository.displayListFacility();
  }

  @Override
  public void addService(Facility facility) {
    iFacilityRepository.addService(facility);
  }


}
