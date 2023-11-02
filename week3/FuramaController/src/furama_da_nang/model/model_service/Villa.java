package furama_da_nang.model.model_service;


public class Villa extends Facility{
private String roomStandards;
private Double poolArea;
private Integer floors;


  public Villa() {
  }

  public Villa(String idService, String nameService, Double areaUseArea, Long leasePrice,
      Integer maximumPeople, String rentalType, String roomStandards, Double poolArea,
      Integer floors) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, rentalType);
    this.roomStandards = roomStandards;
    this.poolArea = poolArea;
    this.floors = floors;
  }

  public String getRoomStandards() {
    return roomStandards;
  }

  public void setRoomStandards(String roomStandards) {
    this.roomStandards = roomStandards;
  }

  public Double getPoolArea() {
    return poolArea;
  }

  public void setPoolArea(Double poolArea) {
    this.poolArea = poolArea;
  }

  public Integer getFloors() {
    return floors;
  }

  public void setFloors(Integer floors) {
    this.floors = floors;
  }

  @Override
  public String toString() {
    return "Villa{" +
        "roomStandards='" + roomStandards + '\'' +
        ", poolArea=" + poolArea +
        ", floors=" + floors +
        "} " + super.toString();
  }
}
