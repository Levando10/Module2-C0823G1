package repository;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import utils.employee.ReadFileEmployee;
import utils.employee.WriteFileEmployee;

public class EmployeeRepository implements IEmployeeRepository {

  private static List<Employee> employeeList = ReadFileEmployee.readFileEmployee();

  @Override
  public void addNewEmployee(Employee employee) {
    employeeList = ReadFileEmployee.readFileEmployee();
    employeeList.add(employee);
    WriteFileEmployee.WriteListEmployee(employeeList);

  }

  @Override
  public boolean checkIdEmployee(String idEmployee) {
    for (Employee temp : employeeList) {
      if (temp.getIdEmployee().equals(idEmployee)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public List<Employee> displayListEmployee() {
    employeeList = ReadFileEmployee.readFileEmployee();

    return employeeList;
  }

  @Override
  public Employee findById(String idEmployee) {
    for (Employee temp : employeeList) {
      if (temp.getIdEmployee().equals(idEmployee)){
        return temp;
      }
    }
    return null;
  }

  @Override
  public boolean editEmployee(Employee employee) {
    employeeList = ReadFileEmployee.readFileEmployee();
    for (Employee tempEdit : employeeList){
      if (tempEdit.getIdEmployee().equals(employee.getIdEmployee())){
        tempEdit.setName(employee.getName());
        tempEdit.setGender(employee.getGender());
        tempEdit.setIdentityNumber(employee.getIdentityNumber());
        tempEdit.setPhoneNumber(employee.getPhoneNumber());
        tempEdit.setBirthDay(employee.getBirthDay());
        tempEdit.setEmail(employee.getEmail());
        tempEdit.setPosition(employee.getPosition());
        tempEdit.setSalary(employee.getSalary());
        WriteFileEmployee.WriteListEmployee(employeeList);
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean deleteEmployee(String idEmployee) {
    employeeList = ReadFileEmployee.readFileEmployee();
    for (Employee temp : employeeList ){
      if (temp.getIdEmployee().equals(idEmployee)){
        employeeList.remove(temp);
        WriteFileEmployee.WriteListEmployee(employeeList);
        return true;
      }
    }
    return false;
  }

  @Override
  public List<Employee> searchEmployee(String nameSearch) {
    List<Employee> searchEmployees = new ArrayList<>();
    boolean checkSearch = false;
    for (Employee tempSearch : employeeList){
      if (tempSearch.getName().toLowerCase().contains(nameSearch.toLowerCase())){
        searchEmployees.add(tempSearch);
        checkSearch = true;
      }
    }
    return checkSearch ?searchEmployees:null;
  }
}
