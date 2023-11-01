package furama_da_nang.view;

import furama_da_nang.controller.EmployeeController;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.Validation;
import java.util.List;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();
    int choice;
    List<Employee> employees;
    Employee employee;

    do {
      System.out.println("----------------------------");
      System.out.println("1. Employee Managemen ");
      System.out.println("2. Customer Management ");
      System.out.println("3. Facility Management ");
      System.out.println("4. Booking Management\n" + "5. Promotion Management\n" + "6. Exit");
      System.out.print("Nhập chức năng : ");
      choice = Validation.checkInputLimit(1, 6);
      switch (choice) {
        case 1:
          System.out.println("---------------Employee Management-------------");
          System.out.println(
              "1 Display list employees\n" + "2 Add new employee\n" + "3 Edit employee\n"
                  + "4 Delete employee\n" + "5 Search by name employee\n" + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 6);
          switch (choice) {
            case 1:
              employees = employeeController.getListEmployee();
              if (employees.isEmpty()){
                System.out.println("List rỗng");
              } else {
                for (Employee employee1 : employees){
                  System.out.println(employee1);
                }
              }

              break;
            case 2:

//              String idEmployee = inputIdEmployee();
//              System.out.print("Nhập tên nhân viên : ");
//              String name = Validation.checkInputString();
//              String gender = inputGender();
//              System.out.print("Nhập ngày sinh : ");
//              String birth = Validation.checkInputString();
//              System.out.print("Nhập căn cước : ");
//              String idNumber = Validation.checkInputString();
//              System.out.print("Nhập số điện thoại nhân viên : ");
//              String phoneNumber = Validation.checkInputString();
//              System.out.print("Nhập email : ");
//              String email = Validation.checkInputString();
//              String position = inputPosition();
//              System.out.print("Nhập lương : ");
//              Double salary = Validation.checkInputDouble();
//             String levelEducation = inputLevelEducation();
//             employee = new Employee(idEmployee,name,gender,idNumber,phoneNumber,birth,email,position,levelEducation,salary);
             employee = new Employee("1","văn độ","Nam","1234567","0982009465","10/11/2002","dolevan055@gmail.com","Lễ tân","Đại học",9999.0);

             employeeController.addEmployee(employee);

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
        case 2:
          System.out.println("---------------Customers Management-------------");
          System.out.println(
              "1.Display list customers\n" + "2 Add new customer\n" + "3 Edit customer\n"
                  + "4 Delete customer\n" + "5 Search by name customer\n" + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 6);
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
    } while (true);
  }

  private static String inputIdEmployee() {
    System.out.print("Nhập id : ");
    return Validation.checkInputString();
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
    System.out.println(" Vị trí");
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
    int choosePosition = Validation.checkInputLimit(1, 6);
    String position = switch (choosePosition) {
      case 1 -> "Trung cấp";
      case 2 -> "Cao đẳng";
      case 3 -> "Đại học";
      case 4 -> "Sau đại học";
      default -> "";
    };

    return position;
  }
}
