package furama_da_nang.model.model_service;



public abstract class Facility {

  private String idService;
  private String nameService;
  private Double areaUseArea;
  private Long leasePrice;
  private Integer maximumPeople;
  private String rentalType;

  public Facility() {
  }

  public Facility(String idService, String nameService, Double areaUseArea, Long leasePrice,
      Integer maximumPeople, String rentalType) {
    this.idService = idService;
    this.nameService = nameService;
    this.areaUseArea = areaUseArea;
    this.leasePrice = leasePrice;
    this.maximumPeople = maximumPeople;
    this.rentalType = rentalType;
  }

  public String getIdService() {
    return idService;
  }

  public void setIdService(String idService) {
    this.idService = idService;
  }

  public String getNameService() {
    return nameService;
  }

  public void setNameService(String nameService) {
    this.nameService = nameService;
  }

  public Double getAreaUseArea() {
    return areaUseArea;
  }

  public void setAreaUseArea(Double areaUseArea) {
    this.areaUseArea = areaUseArea;
  }

  public Long getLeasePrice() {
    return leasePrice;
  }

  public void setLeasePrice(Long leasePrice) {
    this.leasePrice = leasePrice;
  }

  public Integer getMaximumPeople() {
    return maximumPeople;
  }

  public void setMaximumPeople(Integer maximumPeople) {
    this.maximumPeople = maximumPeople;
  }

  public String getRentalType() {
    return rentalType;
  }

  public void setRentalType(String rentalType) {
    this.rentalType = rentalType;
  }

  @Override
  public String toString() {
    return "Facility{" +
        "idService='" + idService + '\'' +
        ", nameService='" + nameService + '\'' +
        ", areaUseArea=" + areaUseArea +
        ", leasePrice=" + leasePrice +
        ", maximumPeople=" + maximumPeople +
        ", type=" + rentalType +
        '}';
  }
}

