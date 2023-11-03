package furama_da_nang.view;

import furama_da_nang.controller.CustomerController;
import furama_da_nang.controller.EmployeeController;
import furama_da_nang.controller.FacilityController;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.model.model_person.Employee;
import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.House;
import furama_da_nang.model.model_service.Room;
import furama_da_nang.model.model_service.Villa;
import furama_da_nang.utils.Validation;
import furama_da_nang.utils.customer.ReadFileCustomer;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FuramaController {


  public static void main(String[] args) {
    EmployeeController employeeController = new EmployeeController();
    CustomerController customerController = new CustomerController();
    FacilityController facilityController = new FacilityController();

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
          Map<Facility, Integer> listMap;
          Set<Facility> keySet;
          do {
            System.out.println("---------------Facility Management-------------");
            System.out.println("""
                1 Display list facility
                2 Add new facility
                3 Display list facility maintenance
                4 Delete facility
                5 Return main menu""");
            System.out.print("Nhập chức năng : ");
            choice = Validation.checkInputLimit(1, 5);
            switch (choice) {
              case 1:
                listMap = facilityController.displayListFacility();
                keySet = listMap.keySet();
                if (listMap.isEmpty()) {
                  System.out.println("Danh sách dịch vụ rỗng");
                } else {
                  for (Facility temp : keySet) {
                    System.out.println(temp + ",sử dụng : " + listMap.get(temp));
                  }
                }
                break;
              case 2:
//
                Facility facility;
                do {
                  System.out.println("---------------Facility Management-------------");
                  System.out.println("""
                      1.Add New Villa
                      2.Add New House     
                      3 Add New Room             
                      4 Back to menu""");
                  System.out.print("Nhập chức năng : ");
                  choice = Validation.checkInputLimit(1, 4);
                  switch (choice) {
                    case 1:
                      facility = inputInformationVilla();
                      facilityController.addService(facility);

                      break;
                    case 2:
                      facility = inputInformationHouse();
                      facilityController.addService(facility);
                      break;
                    case 3:
                      facility = inputInformationRoom();
                      facilityController.addService(facility);
                      break;
                    case 4:
                      break;
                  }

                } while (choice != 4);

                break;
              case 3:
                break;
              case 4:
                break;
              case 5:
                break;
            }
          } while (choice != 5);

          break;
        case 4:
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

  private static Villa inputInformationVilla() {
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdVilla();

    System.out.print("Nhập tên dịch vụ: ");
    String nameService = Validation.checkName();
    System.out.print("Nhập Diện tích sử dụng: ");
    Double areaUse = Validation.checkInputDouble();
    System.out.print("Nhập giá thuê dịch vụ: ");
    Long leasePrice = Validation.checkInputLong();
    System.out.print("Nhập số lượng người tối đa: ");
    Integer maxPeople = Validation.checkInputInteger();
    System.out.print("Nhập loại thuê: ");
    String rentalType = Validation.checkInputString();

    System.out.print("Nhập tiêu chuẩn dịch vụ: ");
    String roomStandards = Validation.checkInputString();
    System.out.print("Nhập số tầng: ");
    Integer floors = Validation.checkInputInteger();
    System.out.print("Nhập Diện tích hồ bơi: ");
    Double poolArea = Validation.checkInputDouble();

    return new Villa(idService, nameService, areaUse, leasePrice, maxPeople, rentalType,
        roomStandards, floors, poolArea);
  }

  private static House inputInformationHouse() {
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdHouse();

    System.out.print("Nhập tên dịch vụ: ");
    String nameService = Validation.checkName();
    System.out.print("Nhập Diện tích sử dụng: ");
    Double areaUse = Validation.checkInputDouble();
    System.out.print("Nhập giá thuê dịch vụ: ");
    Long leasePrice = Validation.checkInputLong();
    System.out.print("Nhập số lượng người tối đa: ");
    Integer maxPeople = Validation.checkInputInteger();
    System.out.print("Nhập loại thuê: ");
    String rentalType = Validation.checkInputString();

    System.out.print("Nhập tiêu chuẩn dịch vụ: ");
    String roomStandards = Validation.checkInputString();
    System.out.print("Nhập số tầng: ");
    Integer floors = Validation.checkInputInteger();

    return new House(idService, nameService, areaUse, leasePrice, maxPeople, rentalType,
        roomStandards, floors);
  }

  private static Room inputInformationRoom() {
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdRoom();

    System.out.print("Nhập tên dịch vụ: ");
    String nameService = Validation.checkName();
    System.out.print("Nhập Diện tích sử dụng: ");
    Double areaUse = Validation.checkInputDouble();
    System.out.print("Nhập giá thuê dịch vụ: ");
    Long leasePrice = Validation.checkInputLong();
    System.out.print("Nhập số lượng người tối đa: ");
    Integer maxPeople = Validation.checkInputInteger();
    System.out.print("Nhập loại thuê: ");
    String rentalType = Validation.checkInputString();

    System.out.print("Nhập dịch vụ miễn phí: ");
    String freeService = Validation.checkInputString();

    return new Room(idService, nameService, areaUse, leasePrice, maxPeople, rentalType,
        freeService);
  }


}
