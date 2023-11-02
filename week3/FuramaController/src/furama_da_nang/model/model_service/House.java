package furama_da_nang.model.model_service;


public class House extends Facility{
  private String roomStandards;
  private Integer floors;

  public House() {
  }

  public House(String roomStandards, Integer floors) {
    this.roomStandards = roomStandards;
    this.floors = floors;
  }

  public House(String idService, String nameService, Double areaUseArea, Long leasePrice,
      Integer maximumPeople, String rentalType, String roomStandards, Integer floors) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, rentalType);
    this.roomStandards = roomStandards;
    this.floors = floors;
  }

  public String getRoomStandards() {
    return roomStandards;
  }

  public void setRoomStandards(String roomStandards) {
    this.roomStandards = roomStandards;
  }

  public Integer getFloors() {
    return floors;
  }

  public void setFloors(Integer floors) {
    this.floors = floors;
  }

  @Override
  public String toString() {
    return "House{" +
        "roomStandards='" + roomStandards + '\'' +
        ", floors=" + floors +
        "} " + super.toString();
  }
}
