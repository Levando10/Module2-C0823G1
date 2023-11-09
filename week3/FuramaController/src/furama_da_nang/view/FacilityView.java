package furama_da_nang.view;

import furama_da_nang.controller.FacilityController;
import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.House;
import furama_da_nang.model.model_service.Room;
import furama_da_nang.model.model_service.Villa;
import furama_da_nang.utils.Validation;
import java.util.Map;
import java.util.Set;

public class FacilityView {
  public static void menuFacility(FacilityController facilityController){
    int choice;
    Map<Facility, Integer> listMap;
    Set<Facility> keySet;
    Facility facility;
    Boolean checkYesNo;
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
          String idFacility;
          listMap = facilityController.displayListFacility();
          if (listMap.isEmpty()) {
            System.out.println("Danh Sách Rỗng!!!");
          } else {
            System.out.print("Nhập id: ");
            idFacility = Validation.checkInputString();
            facility = facilityController.checkDeleteFacility(idFacility);
            if (facility != null) {
              System.out.println(facility);
              System.out.print("Bạn có muốn xóa dịch vụ hay không : ");
              checkYesNo = Validation.checkYesNo();
              if (checkYesNo) {
                facilityController.deleteFacility(idFacility);
                System.out.println("Xóa thành công!!!");
              }
            } else {
              System.out.println("Không tìm thấy tên dịch vụ!!!");
            }

          }

          break;
        case 5:
          break;
      }
    } while (choice != 5);
  }

  private static Villa inputInformationVilla() {
    House house;
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdVilla();

    house = inputGeneral();

    System.out.print("Nhập tiêu chuẩn dịch vụ: ");
    String roomStandards = Validation.checkInputString();
    System.out.print("Nhập số tầng: ");
    Integer floors = Validation.checkInputLeastZero();
    System.out.print("Nhập Diện tích hồ bơi: ");
    Double poolArea = Validation.checkInputArea();

    return new Villa(idService, house.getNameService(), house.getAreaUseArea(),
        house.getLeasePrice(), house.getMaximumPeople(), house.getRentalType(),
        roomStandards, floors, poolArea);
  }

  private static House inputGeneral() {
    System.out.print("Nhập tên dịch vụ: ");
    String nameService = Validation.checkName();
    System.out.print("Nhập Diện tích sử dụng: ");
    Double areaUse = Validation.checkInputArea();
    System.out.print("Nhập giá thuê dịch vụ: ");
    Long leasePrice = Validation.checkInputRental();
    System.out.print("Nhập số lượng người tối đa: ");
    Integer maxPeople = Validation.checkInputMaxPeople();
    System.out.print("Nhập loại thuê: ");
    String rentalType = Validation.checkInputString();
    return new House(nameService, areaUse, leasePrice, maxPeople, rentalType);
  }

  private static House inputInformationHouse() {
    House house;
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdHouse();
    house = inputGeneral();
    System.out.print("Nhập tiêu chuẩn dịch vụ: ");
    String roomStandards = Validation.checkInputString();
    System.out.print("Nhập số tầng: ");
    Integer floors = Validation.checkInputLeastZero();

    return new House(idService, house.getNameService(), house.getAreaUseArea(),
        house.getLeasePrice(), house.getMaximumPeople(), house.getRentalType(),
        roomStandards, floors);
  }

  private static Room inputInformationRoom() {
    House house;
    System.out.print("Nhập mã dịch vụ: ");
    String idService = Validation.checkIdRoom();

    house = inputGeneral();

    System.out.print("Nhập dịch vụ miễn phí: ");
    String freeService = Validation.checkInputString();

    return new Room(idService, house.getNameService(), house.getAreaUseArea(),
        house.getLeasePrice(), house.getMaximumPeople(), house.getRentalType(),
        freeService);
  }
}
