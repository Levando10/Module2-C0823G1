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

  public Employee findById(String idEmployee) {
  return iEmployeeService.findById(idEmployee);
  }

 public void editEmployee(Employee employee) {
  iEmployeeService.editEmployee(employee);
 }

 public void deleteEmployee(String idEmployee) {
  iEmployeeService.deleteEmployee(idEmployee);
 }

 public Boolean checkIdOnly(String idEmployee) {
  return iEmployeeService.checkIdOnly(idEmployee);
 }
}
