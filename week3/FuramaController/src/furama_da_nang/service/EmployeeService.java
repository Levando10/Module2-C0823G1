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
}
