package furama_da_nang.repository;

import furama_da_nang.model.model_person.Customer;
import furama_da_nang.utils.customer.ReadFileCustomer;
import furama_da_nang.utils.customer.WriteFileCustomer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

  private static List<Customer> customers = ReadFileCustomer.readListCustomer();


  @Override
  public List<Customer> getListCustomer() {

    return ReadFileCustomer.readListCustomer();
  }

  @Override
  public void addCustomer(Customer customer) {
    customers.add(customer);
    WriteFileCustomer.writeListCustomer(customers);
  }

  @Override
  public Customer checkIdEmployee(String idCustomer) {
    customers = ReadFileCustomer.readListCustomer();
    for (Customer customer : customers){
      if (customer.getIdCustomer().equals(idCustomer)){
        return customer;
      }
    }
    return null;
  }

  @Override
  public void editCustomer(Customer customer) {
    customers = ReadFileCustomer.readListCustomer();
    for (Customer customerEdit : customers ){
      if (customerEdit.getIdCustomer().equals(customer.getIdCustomer())){
        customerEdit.setName(customer.getName());
        customerEdit.setBirthDay(customer.getBirthDay());
        customerEdit.setGender(customer.getGender());
        customerEdit.setIdentityNumber(customer.getIdentityNumber());
        customerEdit.setPhoneNumber(customer.getPhoneNumber());
        customerEdit.setEmail(customer.getEmail());
        customerEdit.setTypeCustomer(customer.getTypeCustomer());
        customerEdit.setAddress(customer.getAddress());
      }
    }
    WriteFileCustomer.writeListCustomer(customers);
  }

}
