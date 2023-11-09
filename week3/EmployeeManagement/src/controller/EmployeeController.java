package controller;

import java.util.List;
import model.Employee;
import service.EmployeeService;
import service.IEmployeeService;

public class EmployeeController {
private IEmployeeService iEmployeeService = new EmployeeService();

  public void addNewEmployee(Employee employee) {
    iEmployeeService.addNewEmployee(employee);
  }

  public boolean checkIdEmployee(String idEmployee) {
    return iEmployeeService.checkIdEmployee(idEmployee);
  }

  public List<Employee> displayListEmployee() {
    return iEmployeeService.displayListEmployee();
  }

  public Employee findById(String idEmployee) {
    return iEmployeeService.findById(idEmployee);
  }

  public boolean editEmployee(Employee employee) {
    return iEmployeeService.editEmployee(employee);
  }

  public boolean deleteEmployee(String idEmployee) {
   return iEmployeeService.deleteEmployee(idEmployee);
  }

  public List<Employee> searchEmployee(String nameSearch) {
    return iEmployeeService.searchEmployee(nameSearch);
  }
}
