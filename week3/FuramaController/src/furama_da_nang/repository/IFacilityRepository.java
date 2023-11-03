package furama_da_nang.repository;

import furama_da_nang.model.model_service.Facility;
import java.util.Map;

public interface IFacilityRepository  extends Repository{

  Map<Facility, Integer> displayListFacility();

  void addService(Facility facility);
}
