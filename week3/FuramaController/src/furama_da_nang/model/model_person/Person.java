package furama_da_nang.model.model_person;



public  abstract class Person {
  private String name;
  private String birthDay;
  private String gender;
  private String identityNumber;
  private String  phoneNumber;
  private String email;

  public Person() {
  }

  public Person(String name, String birthDay, String gender, String identityNumber,
      String phoneNumber, String email) {
    this.name = name;
    this.birthDay = birthDay;
    this.gender = gender;
    this.identityNumber = identityNumber;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIdentityNumber() {
    return identityNumber;
  }

  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return
        ", Tên: '" + name + '\'' +
        ", sinh nhật: '" + birthDay + '\'' +
        ", giới tính: " + gender +
        ", CMND: '" + identityNumber + '\'' +
        ", Số điện thoại: '" + phoneNumber + '\'' +
        ", Email: '" + email + '\'' ;
  }
}
