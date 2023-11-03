package furama_da_nang.model.model_service;


public class Villa extends House{

private Double poolArea;



  public Villa() {
  }

  public Villa(String idService, String nameService, Double areaUseArea, Long leasePrice,
      Integer maximumPeople, String rentalType, String roomStandards, Integer floors,
      Double poolArea) {
    super(idService, nameService, areaUseArea, leasePrice, maximumPeople, rentalType, roomStandards,
        floors);
    this.poolArea = poolArea;
  }

  public Double getPoolArea() {
    return poolArea;
  }

  public void setPoolArea(Double poolArea) {
    this.poolArea = poolArea;
  }

  @Override
  public String toString() {
    return super.toString() +"Villa{" +
        "poolArea=" + poolArea +
        "} " ;
  }
}
