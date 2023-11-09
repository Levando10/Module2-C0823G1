package furama_da_nang.service;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.Villa;
import java.util.Map;

public interface IFacilityService extends Service{

  Map<Facility, Integer> displayListFacility();


  void addService(Facility facility);

  Facility checkDeleteFacility(String idFacility);

  void deleteFacility(String idFacility);
}
