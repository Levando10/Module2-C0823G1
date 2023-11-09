package furama_da_nang.view;


import furama_da_nang.controller.CustomerController;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.utils.Validation;
import java.util.List;

public class CustomerView {

  public static void menuCustomers(CustomerController customerController) {
    List<Customer> customers;
    String idCustomer;
    int customerChoice;
    Boolean checkYesNo;
    Customer customer;
    do {
      System.out.println("---------------Customers Management-------------");
      System.out.println(
          """
              1.Display list customers
              2 Add new customer
              3 Edit customer
              4 Delete customer
              5 Search by name customer
              6 Return main menu""");
      System.out.print("Nhập chức năng : ");
      customerChoice = Validation.checkInputLimit(1, 6);
      switch (customerChoice) {
        case 1:
          customers = customerController.getListCustomer();
          if (customers.isEmpty()) {
            System.out.println("Danh sách rỗng");
          } else {
            for (Customer temp : customers) {
              System.out.println(temp);
            }
          }
          break;
        case 2:
          idCustomer = inputIdCustomer();
          customer = inputInformationCustomer();
          customer.setIdCustomer(idCustomer);
          customerController.addCustomer(customer);
          break;
        case 3:
          customers = customerController.getListCustomer();
          if (customers.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            idCustomer = inputIdCustomer();
            customer = customerController.checkIdCustomer(idCustomer);
            if (customer != null) {
              System.out.println(customer);
              System.out.print("Bạn có muốn sửa thông tin khách hàng : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo) {
                customer = inputInformationCustomer();
                customer.setIdCustomer(idCustomer);
                customerController.editCustomer(customer);
                System.out.println("Sửa thành công");
              }
            } else {
              System.out.println("Không tìm thấy!!!");
            }

          }
          break;
        case 4:
          customers = customerController.getListCustomer();
          if (customers.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            idCustomer = inputIdCustomer();
            customer = customerController.checkIdCustomer(idCustomer);
            if (customer != null) {
              System.out.println(customer);
              System.out.print("Bạn có muốn xóa thông tin khách hàng : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo) {
                customerController.deleteCustomer(idCustomer);
                System.out.println("Xóa thành công");
              }
            } else {
              System.out.println("Không tìm thấy id khách hàng!!!");
            }
          }
          break;
        case 5:
          String nameSearch;
          customers = customerController.getListCustomer();
          if (customers.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.println("Nhập tên khách hàng cần tìm kiếm : ");
            nameSearch = Validation.checkInputString();
            customers = customerController.searchCustomer(nameSearch);
            if (!customers.isEmpty()) {
              for (Customer temp : customers) {
                System.out.println(temp);
              }
            } else {
              System.out.println("Không tìm thấy");
            }

          }
          break;
        case 6:
          break;
      }
    } while (customerChoice != 6);

  }



  public static Customer inputInformationCustomer() {
    System.out.print("Nhập tên khách hàng : ");
    String name = Validation.checkName();
    String gender = Validation.inputGender();
    System.out.print("Nhập ngày sinh : ");
    String birth = Validation.inputBirthday();
    System.out.print("Nhập căn cước : ");
    String idNumber = Validation.checkIdentityNumber();
    System.out.print("Nhập số điện thoại khách hàng : ");
    String phoneNumber = Validation.checkNumberPhone();
    System.out.print("Nhập email : ");
    String email = Validation.checkEmail();
    String typeCustomer = inputTypeCustomer();
    System.out.print("Nhập địa chỉ : ");
    String address = Validation.checkInputString();
    return new Customer(name, gender, birth, idNumber, phoneNumber, email, typeCustomer, address);
  }
  public static String inputIdCustomer() {
    System.out.print("Nhập id : ");
    return Validation.checkIdCustomer();
  }

  public static String inputTypeCustomer() {
    System.out.println(" Loại khách hàng");
    System.out.println("1. Diamond");
    System.out.println("2. Platinum");
    System.out.println("3. Gold");
    System.out.println("4. Silver");
    System.out.println("5. Member");
    int chooseTypeCustomer = Validation.checkInputLimit(1, 5);
    return switch (chooseTypeCustomer) {
      case 1 -> "Diamond";
      case 2 -> "Platinum";
      case 3 -> "Gold";
      case 4 -> "Silver";
      case 5 -> "Member";
      default -> "";
    };
  }
}
