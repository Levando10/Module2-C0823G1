package furama_da_nang.view;

import furama_da_nang.controller.BookingController;
import furama_da_nang.controller.CustomerController;
import furama_da_nang.controller.EmployeeController;
import furama_da_nang.controller.FacilityController;
import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.model.model_service.Facility;
import furama_da_nang.utils.Validation;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityController facilityController = new FacilityController();
    BookingController bookingController = new BookingController();

    int choice;


    do {
      menuManagement();
      choice = Validation.checkInputLimit(1, 6);
      switch (choice) {
        case 1:
          EmployeeView.menuEmployee(employeeController);
          break;

        case 2:
          CustomerView.menuCustomers(customerController);
          break;
        case 3:
          FacilityView.menuFacility(facilityController);

          break;
        case 4:
          Map<Facility,Integer> facilityMap;
          Set<Facility> keySet;
          List<Customer> customers;
          String idCustomer;
          String inputBookingId;
          Customer cus;
          Booking booking;
          Boolean checkDate;
          System.out.println("---------------Booking Management-------------");
          System.out.println(
              """
                  1 Add new booking
                  2 Display list booking
                  3 Create new contracts
                  4 Display list contracts
                  5 Edit contracts
                  6 Return main menu""");
          System.out.print("Nhập chức năng : ");
          choice = Validation.checkInputLimit(1, 6);
          switch (choice) {
            case 1:
              System.out.println("Danh sách khách hàng :");
              customers = customerController.getListCustomer();
              for (Customer temp : customers){
                System.out.println(temp);
              }

              System.out.print("Nhập id khách hàng booking: ");
              idCustomer = Validation.checkIdCustomer();
              cus = customerController.checkIdCustomer(idCustomer);

             if (cus != null){
               facilityMap = facilityController.displayListFacility();
               keySet = facilityMap.keySet();
               if (facilityMap.isEmpty()) {
                 System.out.println("Danh sách dịch vụ rỗng");
               } else {
                 for (Facility temp : keySet) {
                   System.out.println(temp + ",sử dụng : " + facilityMap.get(temp));
                 }

                 System.out.println("Nhập mã dịch vụ cần book cho khách hàng : ");
                 inputBookingId = Validation.checkIdRoom();
                 System.out.print("NHập ngày bắt đầu : ");
                 String dateStart = Validation.checkInputString();


                 System.out.print("Nhập ngày kết thúc : ");
                 String dateEnd = Validation.checkInputString();

                 booking = new Booking(idCustomer,inputBookingId,dateStart,dateEnd);
                 bookingController.bookingTest(inputBookingId,cus);
                 bookingController.addBooking(booking);

               }

             } else {
               System.out.println("Không tìm thấy khách hàng trùng với id bạn nhập!!!");
             }
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
              """
                  1 Display list customers use service
                  2 Display list customers get voucher
                  3 Return main menu""");
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


  private static void menuManagement() {
    System.out.println("----------------------------");
    System.out.println("1. Employee Management ");
    System.out.println("2. Customer Management ");
    System.out.println("3. Facility Management ");
    System.out.println("""
        4. Booking Management
        5. Promotion Management
        6. Exit""");
    System.out.print("Nhập chức năng : ");
  }


}
