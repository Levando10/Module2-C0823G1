package furama_da_nang.repository;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.House;
import furama_da_nang.model.model_service.Room;
import furama_da_nang.model.model_service.Villa;
import furama_da_nang.utils.facility.WriteFileFacility;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{

  private static Map<Facility,Integer> facilityHashMap = new LinkedHashMap<>();
static {
  facilityHashMap.put(new House("SVHO-0001","Nhà đẹp",700.0,5349278L,15,"5 ngay house ngay","3 sao",3),0);
  facilityHashMap.put(new Room("SVRO-0001","Phòng đẹp",850.0,3529467L,10,"2 ngay","room nha"),0);
  facilityHashMap.put(new Villa("SVVL-0001","Villa đẹp",950.0,34576234L,13,"6 ngay","4 sao",4,35.0),0);
}


  @Override
  public Map<Facility, Integer> displayListFacility() {
    WriteFileFacility.writeListFacility(facilityHashMap);
    return facilityHashMap;
  }

  @Override
  public void addService(Facility facility) {
  facilityHashMap.put(facility,0);

    System.out.println(facility);
  }
}
