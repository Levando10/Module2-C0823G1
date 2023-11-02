package furama_da_nang.repository;

import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.employee.ReadFileEmployee;
import furama_da_nang.utils.employee.WriteFileEmployee;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

  private static List<Employee> employees = ReadFileEmployee.readListEmployee();
//  static {
//   employees.add(  new Employee("2","văn độ","khác","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("3","lâm","nữ","1231234","0657567456","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("4","dụng","Nam","6734523","0321309465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("5","bảo","nữ","568345324","012387867549","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//  }

  @Override
  public void addEmployee(Employee employee) {
    employees.add(employee);
    WriteFileEmployee.writeListEmployee(employees);
  }

  @Override
  public List<Employee> getListEmployee() {
    return ReadFileEmployee.readListEmployee();
  }

  @Override
  public Employee findById(String idEmployee) {
    for (Employee employee : employees) {
      if (employee.getIdEmployee().equals(idEmployee)) {
        return employee;
      }
    }
    return null;
  }

  @Override
  public void editEmployee(Employee employee) {
    // employee = new Employee("1","văn độ","Nam","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0);
    employees = ReadFileEmployee.readListEmployee();
    for (Employee tempEdit : employees) {
      if (tempEdit.getIdEmployee().equals(employee.getIdEmployee())) {
        tempEdit.setName(employee.getName());
        tempEdit.setGender(employee.getGender());
        tempEdit.setIdentityNumber(employee.getIdentityNumber());
        tempEdit.setPhoneNumber(employee.getPhoneNumber());
        tempEdit.setBirthDay(employee.getBirthDay());
        tempEdit.setEmail(employee.getEmail());
        tempEdit.setPosition(employee.getPosition());
        tempEdit.setLevelEducation(employee.getLevelEducation());
        tempEdit.setSalary(employee.getSalary());
      }
    }
    WriteFileEmployee.writeListEmployee(employees);
  }

  @Override
  public void deleteEmployee(String idEmployee) {
  for (Employee tempDelete : employees){
    if (tempDelete.getIdEmployee().equals(idEmployee)){
      employees.remove(tempDelete);
    }
  }
  WriteFileEmployee.writeListEmployee(employees);
  }

  @Override
  public Boolean checkIdOnly(String idEmployee) {
    for (Employee checkId : employees){
      if (checkId.getIdEmployee().equals(idEmployee)){
        return true;
      }
    }
    return false;
  }


}
