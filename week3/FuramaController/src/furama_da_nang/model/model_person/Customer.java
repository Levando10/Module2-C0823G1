package furama_da_nang.model.model_person;

import furama_da_nang.model.enums.Gender;
import furama_da_nang.model.enums.TypeCustomer;

public class Customer extends Person{
private String idCustomer;
private TypeCustomer typeCustomer;
private String address;

  public Customer() {
  }

  public Customer(String name, String birthDay, Gender gender,
      String identityNumber, String phoneNumber, String email, String idCustomer,
      TypeCustomer typeCustomer, String address) {
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

  public TypeCustomer getTypeCustomer() {
    return typeCustomer;
  }

  public void setTypeCustomer(TypeCustomer typeCustomer) {
    this.typeCustomer = typeCustomer;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
