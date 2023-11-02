package furama_da_nang.service;

import furama_da_nang.model.model_person.Employee;
import furama_da_nang.repository.EmployeeRepository;
import furama_da_nang.repository.IEmployeeRepository;
import java.util.List;

public class EmployeeService implements IEmployeeService{
IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

  @Override
  public void addEmployee(Employee employee) {
    iEmployeeRepository.addEmployee(employee);
  }

  @Override
  public List<Employee> getListEmployee() {

    return iEmployeeRepository.getListEmployee();
  }

  @Override
  public Employee findById(String idEmployee) {
    return iEmployeeRepository.findById(idEmployee);
  }

  @Override
  public void editEmployee(Employee employee) {
    iEmployeeRepository.editEmployee(employee);
  }

  @Override
  public void deleteEmployee(String idEmployee) {
    iEmployeeRepository.deleteEmployee(idEmployee);
  }

  @Override
  public Boolean checkIdOnly(String idEmployee) {
    return iEmployeeRepository.checkIdOnly(idEmployee);
  }
}
