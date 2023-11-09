package model;

public class Employee extends Person{
  private String idEmployee;
  private String position;
  private Long salary;

  public Employee() {
  }

  public Employee(String idEmployee, String name, String gender, String identityNumber,
      String phoneNumber, String birthDay, String email, String position,
      Long salary) {
    super(name, birthDay, gender, identityNumber, phoneNumber, email);
    this.idEmployee = idEmployee;
    this.position = position;
    this.salary = salary;

  }

  public Employee( String name, String gender, String identityNumber,
      String phoneNumber, String birthDay, String email, String position,
      Long salary) {
    super(name, birthDay, gender, identityNumber, phoneNumber, email);
    this.position = position;
    this.salary = salary;

  }

  public String getIdEmployee() {
    return idEmployee;
  }

  public void setIdEmployee(String idEmployee) {
    this.idEmployee = idEmployee;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }



  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return
        " Id Nhân viên: " + idEmployee  +
            super.toString()+
            ", Chức vụ: " + position +
            ",  lương: " + salary +
            " " ;
  }
}
