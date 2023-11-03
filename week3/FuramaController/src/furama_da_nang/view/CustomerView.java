package furama_da_nang.view;


import furama_da_nang.utils.Validation;

public class CustomerView {
  private static String inputIdEmployee() {
    System.out.print("Nhập id : ");
    return Validation.checkIdEmployee();
  }

  private static String inputIdCustomer() {
    System.out.print("Nhập id : ");
    return Validation.checkIdCustomer();
  }
}
