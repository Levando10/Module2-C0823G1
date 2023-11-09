package furama_da_nang.controller;

import furama_da_nang.model.model_person.Customer;
import furama_da_nang.service.CustomerService;
import furama_da_nang.service.ICustomerService;
import java.util.List;

public class CustomerController {
private ICustomerService iCustomerService = new CustomerService();


  public List<Customer> getListCustomer() {
    return iCustomerService.getListCustomer();
  }

  public void addCustomer(Customer customer) {
    iCustomerService.addCustomer(customer);
  }

  public Customer checkIdCustomer(String idCustomer) {
    return iCustomerService.checkIdCustomer(idCustomer);
  }

  public void editCustomer(Customer customer) {
    iCustomerService.editCustomer(customer);
  }


  public void deleteCustomer(String idCustomer) {
    iCustomerService.deleteCustomer(idCustomer);
  }

  public List<Customer> searchCustomer(String nameSearch) {
    return iCustomerService.searchCustomer(nameSearch);
  }
}
