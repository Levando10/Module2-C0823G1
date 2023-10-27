package furama_da_nang.model.model_person;

import furama_da_nang.model.enums.Gender;
import furama_da_nang.model.enums.LevelEducation;
import furama_da_nang.model.enums.Position;

public class Employee extends Person{
private String idEmployee;
private Position position;
private LevelEducation levelEducation;
private Double salary;

  public Employee() {
  }

  public Employee(String name, String birthDay, Gender gender,
      String identityNumber, String phoneNumber, String email, String idEmployee, Position position,
      LevelEducation levelEducation, Double salary) {
    super(name, birthDay, gender, identityNumber, phoneNumber, email);
    this.idEmployee = idEmployee;
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

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public LevelEducation getLevelEducation() {
    return levelEducation;
  }

  public void setLevelEducation(LevelEducation levelEducation) {
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
