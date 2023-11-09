package repository;

import java.util.List;
import model.Employee;

public interface IEmployeeRepository {

  void addNewEmployee(Employee employee);

  boolean checkIdEmployee(String idEmployee);

  List<Employee> displayListEmployee();

  Employee findById(String idEmployee);

  boolean editEmployee(Employee employee);

  boolean deleteEmployee(String idEmployee);

  List<Employee> searchEmployee(String nameSearch);
}
