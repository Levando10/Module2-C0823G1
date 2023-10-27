package furama_da_nang.model.model_service;

import furama_da_nang.model.enums.RentalType;

public class Villa extends Facility{
private String roomStandards;
private Integer poolArea;
private Integer floors;


  public Villa() {
  }

  public Villa(String idService, String nameService, Integer areaUseArea, Long leasePrice,
      Integer maximumPeople, Integer value, RentalType type, String roomStandards, Integer poolArea,
      Integer floors) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, value, type);
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

  public Integer getPoolArea() {
    return poolArea;
  }

  public void setPoolArea(Integer poolArea) {
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
