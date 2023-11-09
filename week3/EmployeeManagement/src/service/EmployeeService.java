package service;

import java.util.List;
import model.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
  private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

  @Override
  public void addNewEmployee(Employee employee) {
    iEmployeeRepository.addNewEmployee(employee);
  }

  @Override
  public boolean checkIdEmployee(String idEmployee) {
    return iEmployeeRepository.checkIdEmployee(idEmployee);
  }

  @Override
  public List<Employee> displayListEmployee() {
    return iEmployeeRepository.displayListEmployee();
  }

  @Override
  public Employee findById(String idEmployee) {
    return iEmployeeRepository.findById(idEmployee);
  }

  @Override
  public boolean editEmployee(Employee employee) {
    return iEmployeeRepository.editEmployee(employee);

  }

  @Override
  public boolean deleteEmployee(String idEmployee) {
    return iEmployeeRepository.deleteEmployee(idEmployee);
  }

  @Override
  public List<Employee> searchEmployee(String nameSearch) {
    return iEmployeeRepository.searchEmployee(nameSearch);
  }
}
