package furama_da_nang.model.model_service;



public abstract class Facility {

  private String idService;
  private String nameService;
  private Integer areaUseArea;
  private Long leasePrice;
  private Integer maximumPeople;
  private Integer value;
  private String type;

  public Facility() {
  }

  public Facility(String idService, String nameService, Integer areaUseArea, Long leasePrice,
      Integer maximumPeople, Integer value, String type) {
    this.idService = idService;
    this.nameService = nameService;
    this.areaUseArea = areaUseArea;
    this.leasePrice = leasePrice;
    this.maximumPeople = maximumPeople;
    this.value = value;
    this.type = type;
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

  public Integer getAreaUseArea() {
    return areaUseArea;
  }

  public void setAreaUseArea(Integer areaUseArea) {
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

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Facility{" +
        "idService='" + idService + '\'' +
        ", nameService='" + nameService + '\'' +
        ", areaUseArea=" + areaUseArea +
        ", leasePrice=" + leasePrice +
        ", maximumPeople=" + maximumPeople +
        ", value=" + value +
        ", type=" + type +
        '}';
  }
}

