package furama_da_nang.service;

import furama_da_nang.model.model_person.Customer;
import furama_da_nang.repository.CustomerRepository;
import furama_da_nang.repository.ICustomerRepository;
import java.util.List;

public class CustomerService implements ICustomerService{
  private ICustomerRepository iCustomerRepository = new CustomerRepository();


  @Override
  public List<Customer> getListCustomer() {
    return iCustomerRepository.getListCustomer();
  }

  @Override
  public void addCustomer(Customer customer) {
    iCustomerRepository.addCustomer(customer);
  }

  @Override
  public Customer checkIdEmployee(String idCustomer) {
    return iCustomerRepository.checkIdEmployee(idCustomer);
  }

  @Override
  public void editCustomer(Customer customer) {
    iCustomerRepository.editCustomer(customer);
  }

  @Override
  public void deleteCustomer(String idCustomer) {
    iCustomerRepository.deleteCustomer(idCustomer);
  }

  @Override
  public List<Customer> searchCustomer(String nameSearch) {
    return iCustomerRepository.searchCustomer(nameSearch);
  }


}
