package furama_da_nang.view;

import furama_da_nang.controller.EmployeeController;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.utils.Validation;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();
    int choice;

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
              break;
            case 2:
              Employee employee;
              String idEmployee = inputIdEmployee();
              System.out.print("Nhập tên nhân viên : ");
              String name = Validation.checkInputString();
              String gender = inputGender();
              System.out.println(idEmployee + name + gender);

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
    System.out.println(" Giới tính");
    System.out.println("1. Nam");
    System.out.println("2. Nữ");
    System.out.println("3. Khác");
    System.out.print("Nhập giới tính : ");
    int chooseGender = Validation.checkInputLimit(1, 3);
    String gender = "";
    switch (chooseGender) {
      case 1:
        gender = "Nam";
        break;
      case 2:
        gender = "Nữ";
        break;
      case 3:
        gender = "Khác";
        break;
    }
    return gender;
  }
}
