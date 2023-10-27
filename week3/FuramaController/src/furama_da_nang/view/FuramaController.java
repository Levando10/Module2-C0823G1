package furama_da_nang.view;

import furama_da_nang.utils.Validation;

public class FuramaController {


  public static void main(String[] args) {
    int choice;

    do {
      System.out.println("----------------------------");
      System.out.println("1. Employee Managemen ");
      System.out.println("2. Customer Management ");
      System.out.println("3. Facility Management ");
      System.out.println("4. Booking Management\n"
          + "5. Promotion Management\n"
          + "6. Exit");
      System.out.print("Nhập chức năng : ");
       choice = Validation.checkInputLimit(0, 6);
      switch (choice) {
        case 1:
          System.out.println("---------------Employee Management-------------");
          System.out.println("1 Display list employees\n"
              + "2 Add new employee\n"
              + "3 Edit employee\n"
              + "4 Delete employee\n"
              + "5 Search by name employee\n"
              + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1,6);
          break;
        case 2:
          System.out.println("---------------Customers Management-------------");
          System.out.println("1.Display list customers\n"
              + "2 Add new customer\n"
              + "3 Edit customer\n"
              + "4 Delete customer\n"
              + "5 Search by name customer\n"
              + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1,6);
          break;
        case 3:
          System.out.println("---------------Facility Management-------------");
          System.out.println("1 Display list facility\n"
              + "2 Add new facility\n"
              + "3 Display list facility maintenance\n"
              + "4 Delete facility\n"
              + "5 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1,5);
          break;
        case 4:
          System.out.println("---------------Booking Management-------------");
          System.out.println("1 Add new booking\n"
              + "2 Display list booking\n"
              + "3 Create new contracts\n"
              + "4 Display list contracts\n"
              + "5 Edit contracts\n"
              + "6 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1,5);
          break;
        case 5:
          System.out.println("---------------Promotion Management-------------");
          System.out.println("1 Display list customers use service\n"
              + "2 Display list customers get voucher\n"
              + "3 Return main menu");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1,3);
          break;
        case 6:
          System.exit(0);
          break;


      }
    } while (true);
  }
}
