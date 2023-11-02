package furama_da_nang.utils.customer;

import furama_da_nang.model.model_person.Customer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCustomer {

  private static final String PATH = "FuramaController/src/furama_da_nang/data/customerList.csv";

  public static List<Customer> readListCustomer() {
    List<Customer> customers = new ArrayList<>();
    File file = new File(PATH);
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    Customer customer;

    try {
      String temp;
      String[] tempString;
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);
      while ((temp = bufferedReader.readLine()) != null) {
        tempString = temp.split(",");
        customer = new Customer(tempString[0], tempString[1], tempString[2], tempString[3],
            tempString[4], tempString[5], tempString[6], tempString[7], tempString[8]);
        customers.add(customer);
      }
      return customers;

    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  }
}
