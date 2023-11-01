package furama_da_nang.model.model_person;

public class Customer extends Person {

  private String idCustomer;
  private String typeCustomer;
  private String address;

  public Customer() {
  }

  public Customer(String name, String birthDay, String gender,
      String identityNumber, String phoneNumber, String email, String idCustomer,
      String typeCustomer, String address) {
    super(name, birthDay, gender, identityNumber, phoneNumber, email);
    this.idCustomer = idCustomer;
    this.typeCustomer = typeCustomer;
    this.address = address;
  }

  public String getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(String idCustomer) {
    this.idCustomer = idCustomer;
  }

  public String getTypeCustomer() {
    return typeCustomer;
  }

  public void setTypeCustomer(String typeCustomer) {
    this.typeCustomer = typeCustomer;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
