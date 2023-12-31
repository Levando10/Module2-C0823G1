package furama_da_nang.service;

import furama_da_nang.model.model_person.Customer;
import java.util.List;

public interface ICustomerService extends Service{


  List<Customer> getListCustomer();

  void addCustomer(Customer customer);

  Customer checkIdCustomer(String idCustomer);

  void editCustomer(Customer customer);


  void deleteCustomer(String idCustomer);

  List<Customer> searchCustomer(String nameSearch);
}
