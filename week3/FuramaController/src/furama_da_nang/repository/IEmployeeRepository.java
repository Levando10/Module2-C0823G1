package furama_da_nang.repository;

import furama_da_nang.model.model_person.Employee;
import java.util.List;

public interface IEmployeeRepository  extends Repository{

  void addEmployee(Employee employee);

  List<Employee> getListEmployee();
}
