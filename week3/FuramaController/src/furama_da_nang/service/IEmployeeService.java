package furama_da_nang.service;

import furama_da_nang.model.model_person.Employee;
import java.util.List;

public interface IEmployeeService extends Service {

  void addEmployee(Employee employee);

  List<Employee> getListEmployee();
}
