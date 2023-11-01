package furama_da_nang.service;

import furama_da_nang.repository.EmployeeRepository;
import furama_da_nang.repository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
}
