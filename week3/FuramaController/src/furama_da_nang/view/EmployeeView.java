package furama_da_nang.view;

import furama_da_nang.controller.EmployeeController;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.Validation;
import java.util.List;

public class EmployeeView {
  public static void menuEmployee(EmployeeController employeeController) {
    List<Employee> employees;
    Employee employee;
    String idEmployee;
    int employeeChoice;
    Boolean checkYesNo;
    do {
      System.out.println("---------------Employee Management-------------");
      System.out.println(
          """
              1 Display list employees
              2 Add new employee
              3 Edit employee
              4 Delete employee
              5 Search by name employee
              6 Return main menu""");
      System.out.print("Nhập chức năng : ");
      employeeChoice = Validation.checkInputLimit(1, 6);
      switch (employeeChoice) {
        case 1 -> {
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("List rỗng");
          } else {
            for (Employee employee1 : employees) {
              System.out.println(employee1);
            }
          }
          menuEmployee(employeeController);
        }
        case 2 -> {
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
        }
        case 3 -> {
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
        }
        case 4 -> {
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
        }
        case 5 -> {
          employees = employeeController.getListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.print("Nhập tên nhân viên cần tìm : ");
            String nameSearch = Validation.checkInputString();
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
        }
      }
      break;
    } while (employeeChoice != 6);
  }
  private static String inputIdEmployee() {
    System.out.print("Nhập id : ");
    return Validation.checkIdEmployee();
  }
  private static Employee inputInformationEmployee() {
    System.out.print("Nhập tên nhân viên : ");
    String name = Validation.checkName();
    String gender = Validation.inputGender();
    System.out.print("Nhập ngày sinh : ");
    String birth = Validation.inputBirthday();
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

    return switch (choosePosition) {
      case 1 -> "Lễ tân";
      case 2 -> "Phục vụ";
      case 3 -> "Chuyên viên";
      case 4 -> "Giám sát";
      case 5 -> "Quản lýQuản lý";
      case 6 -> "Giám đốc";
      default -> "";
    };
  }

  private static String inputLevelEducation() {
    System.out.println(" Trình độ học vấn ");
    System.out.println("1. Trung cấp");
    System.out.println("2. Cao đẳng");
    System.out.println("3. Đại học");
    System.out.println("4. Sau đại học");
    System.out.print("Nhập trình độ : ");
    int choosePosition = Validation.checkInputLimit(1, 4);

    return switch (choosePosition) {
      case 1 -> "Trung cấp";
      case 2 -> "Cao đẳng";
      case 3 -> "Đại học";
      case 4 -> "Sau đại học";
      default -> "";
    };
  }
}
