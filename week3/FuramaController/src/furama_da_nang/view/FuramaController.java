package furama_da_nang.view;

import furama_da_nang.controller.EmployeeController;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.Validation;
import java.util.List;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();

    List<Employee> employees;
    Employee employee;
    int choice;

    do {
      menuManagement();
      choice = Validation.checkInputLimit(1, 6);
      switch (choice) {
        case 1:
          menuEmployee(employeeController);
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
    } while (choice != 6);
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
         if (employees.isEmpty()){
           System.out.println("Danh sách rỗng!!!");
         } else {
           System.out.println("Nhập tên nhân viên cần tìm : ");
           String nameSearch = Validation.checkInputString();

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

  private static Employee inputInformationEmployee() {
    System.out.print("Nhập tên nhân viên : ");
    String name = Validation.checkInputString();
    String gender = inputGender();
    System.out.print("Nhập ngày sinh : ");
    String birth = Validation.checkInputString();
    System.out.print("Nhập căn cước : ");
    String idNumber = Validation.checkInputString();
    System.out.print("Nhập số điện thoại nhân viên : ");
    String phoneNumber = Validation.checkNumberPhone();
    System.out.print("Nhập email : ");
    String email = Validation.checkEmail();
    String position = inputPosition();
    System.out.print("Nhập lương : ");
    Double salary = Validation.checkInputDouble();
    String levelEducation = inputLevelEducation();
    return new Employee(name, gender, idNumber, phoneNumber, birth, email, position, levelEducation,
        salary);
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
