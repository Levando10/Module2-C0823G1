package view;

import controller.EmployeeController;
import java.util.List;
import model.Employee;
import utils.Validation;

public class ManagementEmployee {

  public static void main(String[] args) {
    int choice;
    Employee employee;
    String idEmployee;
    boolean checkId;
    boolean checkSuccess;
    boolean checkYesNo;
    List<Employee> employees;
    List<Employee> listSearch;
    EmployeeController employeeController = new EmployeeController();

    do {
      System.out.println("---------------Employee Management-------------");
      System.out.println(
          """
              1 Display list employees
              2 Add new employee
              3 Edit employee
              4 Delete employee
              5 Search by name employee
              6 Exit""");
      System.out.print("Nhập chức năng : ");
      choice = Validation.checkInputLimit(1, 6);
      switch (choice) {
        case 1:
          employees = employeeController.displayListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            for (Employee temp : employees) {
              System.out.println(temp);
            }
          }

          break;
        case 2:
          do {
            idEmployee = inputIdEmployee();
            checkId = employeeController.checkIdEmployee(idEmployee);
            if (checkId) {
              System.out.println("Id trùng vui lòng nhập lại : ");
            }
          } while (checkId);

          employee = inputInformationEmployee();
          employee.setIdEmployee(idEmployee);

          employeeController.addNewEmployee(employee);

          break;
        case 3:
          employees = employeeController.displayListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.println("Nhập id nhân viên cần sửa");
            idEmployee = inputIdEmployee();
            employee = employeeController.findById(idEmployee);
            if (employee != null) {
              System.out.println(employee);
              System.out.print("Bạn có muốn sửa nhân viên này hay không(Y or N) : ");
              checkYesNo = Validation.checkYesNo();

              if (checkYesNo){
                System.out.println("Nhập thông tin cần sửa!!!");
                employee = inputInformationEmployee();
                employee.setIdEmployee(idEmployee);
                checkSuccess = employeeController.editEmployee(employee);
                if (checkSuccess){
                  System.out.println("Sửa thành công!!!");
                } else {
                  System.out.println("Sửa không thành công!!!");
                }
              } else {
                break;
              }

            } else {
              System.out.println("Không tìm thấy!!!");
            }
          }

          break;
        case 4:
          employees = employeeController.displayListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            idEmployee = inputIdEmployee();
            employee = employeeController.findById(idEmployee);
            if (employee != null){
              System.out.println(employee);
              System.out.print("Bạn có muốn xóa nhân viên này hay không : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo){
              checkSuccess =   employeeController.deleteEmployee(idEmployee);
                if (checkSuccess){
                  System.out.println("xóa thành công!!!");
                } else {
                  System.out.println("xóa không thhành công");
                }
              }
            } else {
              System.out.println("Không tìm thấy!!!");
            }
          }

          break;
        case 5:
          employees = employeeController.displayListEmployee();
          if (employees.isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
          } else {
            System.out.print("Nhập tên nhân viên cần tìm : ");
            String nameSearch = Validation.checkInputString();
            listSearch = employeeController.searchEmployee(nameSearch);
            if (listSearch != null) {
              for (Employee emSearch : listSearch) {
                System.out.println(emSearch);
              }
            } else {
              System.out.println("Không tìm thấy tên nhân viên!!!");
            }


          }
          break;
        case 6:
          System.exit(0);
      }
    } while (true);
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
    Long salary = Validation.checkSalary();
    return new Employee(name ,gender, idNumber, phoneNumber, birth,
        email,position, salary);
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
      case 5 -> "Quản lý";
      case 6 -> "Giám đốc";
      default -> "";
    };
  }

  private static String inputIdEmployee() {
    System.out.print("Nhập id : ");
    return Validation.checkIdEmployee();
  }


}
