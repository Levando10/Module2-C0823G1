package furama_da_nang.view;

import furama_da_nang.controller.CustomerController;
import furama_da_nang.controller.EmployeeController;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.Validation;
import furama_da_nang.utils.customer.ReadFileCustomer;
import java.util.List;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();

    int choice;

    do {
      menuManagement();
      choice = Validation.checkInputLimit(1, 6);
      switch (choice) {
        case 1:
          menuEmployee(employeeController);
          break;

        case 2:
          menuCustomers(customerController);
          break;
        case 3:
          System.out.println("---------------Facility Management-------------");
          System.out.println("1 Display list facility\n" + "2 Add new facility\n"
              + "3 Display list facility maintenance\n" + "4 Delete facility\n"
              + "5 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 5);
          switch (choice) {
            case 1:
              break;
            case 2:
              break;
            case 3:
              break;
            case 4:
              break;
            case 5:
              break;
          }
          break;
        case 4:
          System.out.println("---------------Booking Management-------------");
          System.out.println(
              "1 Add new booking\n" + "2 Display list booking\n" + "3 Create new contracts\n"
                  + "4 Display list contracts\n" + "5 Edit contracts\n" + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 5);
          switch (choice) {
            case 1:
              break;
            case 2:
              break;
            case 3:
              break;
            case 4:
              break;
            case 5:
              break;
            case 6:
              break;
          }
          break;
        case 5:
          System.out.println("---------------Promotion Management-------------");
          System.out.println(
              "1 Display list customers use service\n" + "2 Display list customers get voucher\n"
                  + "3 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 3);
          switch (choice) {
            case 1:
              break;
            case 2:
              break;
            case 3:
              break;
          }
          break;
        case 6:
          System.exit(0);
          break;


      }
    } while (choice != 6);
  }

  private static void menuCustomers(CustomerController customerController) {
    List<Customer> customers;
    String idCustomer;
    int customerChoice;
    Boolean checkYesNo;
    Customer customer;
    do {
      System.out.println("---------------Customers Management-------------");
      System.out.println(
          "1.Display list customers\n" + "2 Add new customer\n" + "3 Edit customer\n"
              + "4 Delete customer\n" + "5 Search by name customer\n" + "6 Return main menu");
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
          if (customers.isEmpty()){
            System.out.println("Danh sách rỗng!!!");
          } else {
            idCustomer = inputIdCustomer();
           customer = customerController.checkIdEmployee(idCustomer);
           if (customer != null){
             System.out.println(customer);
             System.out.print("Bạn có muốn sửa thông tin khách hàng : ");
             checkYesNo = Validation.checkYesNo();
             if (checkYesNo){
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
          if (customers.isEmpty()){
            System.out.println("Danh sách rỗng!!!");
          } else {
            idCustomer = inputIdCustomer();
            customer = customerController.checkIdEmployee(idCustomer);
            if (customer != null){
              System.out.println(customer);
              System.out.print("Bạn có muốn xóa thông tin khách hàng : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo){
                  customerController.deleteCustomer(idCustomer);
                System.out.println("Xóa thành công");
              }
            }else {
              System.out.println("Không tìm thấy id khách hàng!!!");
            }
          }
          break;
        case 5:
          String nameSearch;
          customers = customerController.getListCustomer();
          if (customers.isEmpty()){
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.println("Nhập tên khách hàng cần tìm kiếm : ");
            nameSearch = Validation.checkInputString();
            customers = customerController.searchCustomer(nameSearch);
            if (!customers.isEmpty()){
              for (Customer temp : customers){
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

  private static void menuEmployee(EmployeeController employeeController) {
    List<Employee> employees;
    Employee employee;
    String idEmployee;
    int employeeChoice;
    Boolean checkYesNo;
    do {
      System.out.println("---------------Employee Management-------------");
      System.out.println(
          "1 Display list employees\n" + "2 Add new employee\n" + "3 Edit employee\n"
              + "4 Delete employee\n" + "5 Search by name employee\n" + "6 Return main menu");
      System.out.print("Nhập chức năng : ");
      employeeChoice = Validation.checkInputLimit(1, 6);
      switch (employeeChoice) {
        case 1:
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("List rỗng");
          } else {
            for (Employee employee1 : employees) {
              System.out.println(employee1);
            }
          }
          menuEmployee(employeeController);
          break;
        case 2:
          idEmployee = inputIdEmployee();
          Boolean checkId = employeeController.checkIdOnly(idEmployee);
          while (checkId) {
            System.out.println("Vui lòng không nhập id trùng !!!");
            idEmployee = inputIdEmployee();
            checkId = employeeController.checkIdOnly(idEmployee);
          }

          employee = inputInformationEmployee();
          employee.setIdEmployee(idEmployee);
          employeeController.addEmployee(employee);
          menuEmployee(employeeController);
          break;
        case 3:
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("List rỗng");
          } else {
            idEmployee = inputIdEmployee();
            employee = employeeController.findById(idEmployee);
            if (employee != null) {
              System.out.println(employee);
              System.out.print("Bạn có muốn sửa nhân viên này hay không : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo) {
                employee = inputInformationEmployee();
                employee.setIdEmployee(idEmployee);
                employeeController.editEmployee(employee);
              }
            } else {
              System.out.println("Không tìm thấy nhân viên hợp lệ!!!");
            }
          }

          menuEmployee(employeeController);
          break;
        case 4:
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("List rỗng");
          } else {
            idEmployee = inputIdEmployee();
            employee = employeeController.findById(idEmployee);
            if (employee != null) {
              System.out.println(employee);
              System.out.print("Bạn có muốn xóa nhân viên này hay không : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo) {
                employeeController.deleteEmployee(idEmployee);
                System.out.println("Xóa thành công!!!");
              }
            } else {
              System.out.println("Không tìm thấy!!!");
            }
          }
          menuEmployee(employeeController);
          break;
        case 5:
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.print("Nhập tên nhân viên cần tìm : ");
            String nameSearch = Validation.checkName();
            List<Employee> listSearch = employeeController.searchEmployee(nameSearch);
            if (listSearch != null) {
              for (Employee emSearch : listSearch) {
                System.out.println(emSearch);
              }
            } else {
              System.out.println("Không tìm thấy tên nhân viên!!!");
            }


          }

          menuEmployee(employeeController);
          break;
      }
      break;
    } while (employeeChoice != 6);
  }

  private static void menuManagement() {
    System.out.println("----------------------------");
    System.out.println("1. Employee Management ");
    System.out.println("2. Customer Management ");
    System.out.println("3. Facility Management ");
    System.out.println("4. Booking Management\n" + "5. Promotion Management\n" + "6. Exit");
    System.out.print("Nhập chức năng : ");
  }

  private static String inputIdEmployee() {
    System.out.print("Nhập id : ");
    return Validation.checkIdEmployee();
  }

  private static String inputIdCustomer() {
    System.out.print("Nhập id : ");
    return Validation.checkIdCustomer();
  }

  private static Employee inputInformationEmployee() {
    System.out.print("Nhập tên nhân viên : ");
    String name = Validation.checkName();
    String gender = inputGender();
    System.out.print("Nhập ngày sinh : ");
    String birth = Validation.checkInputString();
    System.out.print("Nhập căn cước : ");
    String idNumber = Validation.checkIdentityNumber();
    System.out.print("Nhập số điện thoại nhân viên : ");
    String phoneNumber = Validation.checkNumberPhone();
    System.out.print("Nhập email : ");
    String email = Validation.checkEmail();
    String position = inputPosition();
    System.out.print("Nhập lương : ");
    Double salary = Validation.checkSalary();
    String levelEducation = inputLevelEducation();
    return new Employee(name, gender, idNumber, phoneNumber, birth, email, position, levelEducation,
        salary);
  }

  private static Customer inputInformationCustomer() {
    System.out.print("Nhập tên khách hàng : ");
    String name = Validation.checkName();
    String gender = inputGender();
    System.out.print("Nhập ngày sinh : ");
    String birth = Validation.checkInputString();
    System.out.print("Nhập căn cước : ");
    String idNumber = Validation.checkIdentityNumber();
    System.out.print("Nhập số điện thoại khách hàng : ");
    String phoneNumber = Validation.checkNumberPhone();
    System.out.print("Nhập email : ");
    String email = Validation.checkEmail();
    String typeCustomer = inputTypeCustomer();
    System.out.print("Nhập địa chỉ : ");
    String address = Validation.checkInputString();
    return new Customer(name,gender,birth,idNumber,phoneNumber,email,typeCustomer,address);
  }

  private static String inputGender() {
    System.out.println(" \nGiới tính");
    System.out.println("1. Nam");
    System.out.println("2. Nữ");
    System.out.println("3. Khác");
    System.out.print("Nhập giới tính : ");
    int chooseGender = Validation.checkInputLimit(1, 3);
    String gender = switch (chooseGender) {
      case 1 -> "Nam";
      case 2 -> "Nữ";
      case 3 -> "Khác";
      default -> "";
    };
    return gender;
  }

  private static String inputPosition() {
    System.out.println(" \nVị trí");
    System.out.println("1. Lễ tân");
    System.out.println("2. Phục vụ");
    System.out.println("3. Chuyên viên");
    System.out.println("4. Giám sát");
    System.out.println("5. Quản lý");
    System.out.println("6. Giám đốc");
    System.out.print("Nhập vị trí : ");
    int choosePosition = Validation.checkInputLimit(1, 6);
    String position = switch (choosePosition) {
      case 1 -> "Lễ tân";
      case 2 -> "Phục vụ";
      case 3 -> "Chuyên viên";
      case 4 -> "Giám sát";
      case 5 -> "Quản lýQuản lý";
      case 6 -> "Giám đốc";
      default -> "";
    };

    return position;
  }

  private static String inputLevelEducation() {
    System.out.println(" Trình độ học vấn ");
    System.out.println("1. Trung cấp");
    System.out.println("2. Cao đẳng");
    System.out.println("3. Đại học");
    System.out.println("4. Sau đại học");
    System.out.print("Nhập trình độ : ");
    int choosePosition = Validation.checkInputLimit(1, 4);
    String position = switch (choosePosition) {
      case 1 -> "Trung cấp";
      case 2 -> "Cao đẳng";
      case 3 -> "Đại học";
      case 4 -> "Sau đại học";
      default -> "";
    };

    return position;
  }

  private static String inputTypeCustomer() {
    System.out.println(" Loại khách hàng");
    System.out.println("1. Diamond");
    System.out.println("2. Platinum");
    System.out.println("3. Gold");
    System.out.println("4. Silver");
    System.out.println("5. Member");
    int chooseTypeCustomer = Validation.checkInputLimit(1, 5);
    String typeCustomer = switch (chooseTypeCustomer) {
      case 1 -> "Diamond";
      case 2 -> "Platinum";
      case 3 -> "Gold";
      case 4 -> "Silver";
      case 5 -> "Member";
      default -> "";
    };
    return typeCustomer;
  }
}
