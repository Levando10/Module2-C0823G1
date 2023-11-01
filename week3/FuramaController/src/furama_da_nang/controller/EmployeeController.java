package furama_da_nang.controller;

import furama_da_nang.model.model_person.Employee;
import furama_da_nang.service.EmployeeService;
import furama_da_nang.service.IEmployeeService;
import java.util.List;

public class EmployeeController {
 private IEmployeeService iEmployeeService = new EmployeeService();


 public void addEmployee(Employee employee) {
  iEmployeeService.addEmployee(employee);
 }

  public List<Employee> getListEmployee() {
  return iEmployeeService.getListEmployee();
  }
}
