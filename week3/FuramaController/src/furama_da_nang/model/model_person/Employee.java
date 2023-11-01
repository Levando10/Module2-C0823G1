package furama_da_nang.model.model_person;



public class Employee extends Person{
private String idEmployee;
private String position;
private String levelEducation;
private Double salary;

  public Employee() {
  }

  public Employee(String name, String birthDay, String gender, String identityNumber,
      String phoneNumber, String email, String position, String levelEducation, Double salary) {
    super(name, birthDay, gender, identityNumber, phoneNumber, email);
    this.position = position;
    this.levelEducation = levelEducation;
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

  public String getLevelEducation() {
    return levelEducation;
  }

  public void setLevelEducation(String levelEducation) {
    this.levelEducation = levelEducation;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "idEmployee='" + idEmployee + '\'' +
        ", position=" + position +
        ", levelEducation=" + levelEducation +
        ", salary=" + salary +
        "} " + super.toString();
  }
}
