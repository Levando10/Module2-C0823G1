package furama_da_nang.model.model_service;


public class Room extends Facility{
  private String freeService;

  public Room() {
  }

  public Room(String freeService) {
    this.freeService = freeService;
  }

  public Room(String idService, String nameService, Double areaUseArea, Long leasePrice,
      Integer maximumPeople, String rentalType, String freeService) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, rentalType);
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
    return super.toString() +"Room{" +
        "freeService='" + freeService + '\'' +
        "} " ;
  }
}
