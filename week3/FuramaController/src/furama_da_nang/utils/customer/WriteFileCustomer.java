package furama_da_nang.utils.customer;

import furama_da_nang.model.model_person.Customer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer {
  private static final String PATH = "FuramaController/src/furama_da_nang/data/customerList.csv";

  public static void writeListCustomer(List<Customer> customers){

    File file = new File(PATH);
    FileWriter fileWriter;
    BufferedWriter bufferedWriter = null;
  //    customers.add(new Customer("Lê Văn tình", "10/11/22", "nữ", "1231234", "0657567456", "dolevan055@gmail.com",
    //        "KH-1234", "Member", "Quanh nam"));

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
      for (Customer customer : customers){
            bufferedWriter.write(customer.getName() + "," + customer.getBirthDay() + "," + customer.getGender() +
                "," + customer.getIdentityNumber() + "," + customer.getPhoneNumber() + "," + customer.getEmail() +","
                + customer.getIdCustomer() + "," + customer.getTypeCustomer() + "," + customer.getAddress());
          bufferedWriter.newLine();
      }
      bufferedWriter.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bufferedWriter != null){
        try {
          bufferedWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }


  }

}
