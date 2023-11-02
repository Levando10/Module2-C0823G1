package furama_da_nang.repository;

import furama_da_nang.model.model_person.Customer;
import java.util.List;

public interface ICustomerRepository  extends Repository{

  List<Customer> getListCustomer();

  void addCustomer(Customer customer);

  Customer checkIdEmployee(String idCustomer);

  void editCustomer(Customer customer);


  void deleteCustomer(String idCustomer);

  List<Customer> searchCustomer(String nameSearch);
}
