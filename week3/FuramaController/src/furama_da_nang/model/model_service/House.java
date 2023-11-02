package furama_da_nang.model.model_service;


public class House extends Facility{
  private String roomStandards;
  private Integer floors;

  public House() {
  }

  public House(String idService, String nameService, Integer areaUseArea, Long leasePrice,
      Integer maximumPeople, Integer value, String type, String roomStandards, Integer floors) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, value, type);
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
