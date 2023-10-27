package furama_da_nang.model.model_service;

import furama_da_nang.model.enums.RentalType;

public class Room extends Facility{
  private String freeService;

  public Room() {
  }

  public Room(String idService, String nameService, Integer areaUseArea, Long leasePrice,
      Integer maximumPeople, Integer value, RentalType type, String freeService) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, value, type);
    this.freeService = freeService;
  }

  public String getFreeService() {
    return freeService;
  }

  public void setFreeService(String freeService) {
    this.freeService = freeService;
  }

  @Override
  public String toString() {
    return "Room{" +
        "freeService='" + freeService + '\'' +
        "} " + super.toString();
  }
}
