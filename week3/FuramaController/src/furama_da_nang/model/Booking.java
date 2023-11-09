package furama_da_nang.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
  private String customerCode;
  private String serviceCode;
  private String startDate;
  private String endDate;

  public String getCustomerCode() {
    return customerCode;
  }

  public Booking(String customerCode, String serviceCode, String startDate, String endDate) {
    this.customerCode = customerCode;
    this.serviceCode = serviceCode;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "Booking{" +
        "customerCode='" + customerCode + '\'' +
        ", serviceCode='" + serviceCode + '\'' +
        ", startDate='" + startDate + '\'' +
        ", endDate='" + endDate + '\'' +
        '}';
  }
}
