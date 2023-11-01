package furama_da_nang.repository;

import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.employee.ReadFileEmployee;
import furama_da_nang.utils.employee.WriteFileEmployee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{

  private static List<Employee> employees = ReadFileEmployee.ReadListEmployee();
//  static {
//   employees.add(  new Employee("2","văn độ","khác","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("3","lâm","nữ","1231234","0657567456","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("4","dụng","Nam","6734523","0321309465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//    employees.add(  new Employee("5","bảo","nữ","568345324","012387867549","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0));
//  }

  @Override
  public void addEmployee(Employee employee) {
    employees.add(employee);
    WriteFileEmployee.WriteListEmployee(employees);
  }

  @Override
  public List<Employee> getListEmployee() {
    return employees;
  }
}
