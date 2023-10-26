package array_mvc.views;

import controllers.ProductController;
import demo_mvc.src.utils.validate.Validation;
import models.Product;

import java.util.List;
import java.util.Scanner;

public class MenuMain {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int choice;
    do {
      menuManagement();

      choice = Validation.checkInputLimit(0, 4);
      switch (choice) {
        case 1:
          menuCustomer();
          break;
        case 2:
          menuProduct();
        case 3:
          break;
        case 0:
          System.exit(0);
        default:
          System.out.println("Bạn nhập không đúng lựa chọn");
      }
    } while (true);
  }

  private static void menuManagement(){
    System.out.println("--------Menu---------");
    System.out.println("1. Quản lý khách hàng");
    System.out.println("2. Quản lý sản phẩm");
    System.out.println("3. Quản lý nhân viên");
    System.out.println("4. Quản lý bill");
    System.out.println("0. Exit");
    System.out.print("Nhập lựa chọn: ");

  }
  private static void menuCustomer() {
    System.out.println("--------Menu quản lý khách hàng");
  }

  private static void menuProduct() {
    ProductController productController = new ProductController();
    Boolean isSuccess;
    int choice;
    Integer id;
    Product product;
    do {
      System.out.println("----------Menu quản lý sản phẩm--------");
      System.out.println("1. Hiển thị danh sách");
      System.out.println("2. Thêm sản phẩm");
      System.out.println("3. Xóa sản phẩm");
      System.out.println("4. Sửa thông tin  sản phẩm");
      System.out.println("5. Tìm kiếm sản phẩm theo tên");
      System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
      System.out.println("0. Trở về");
      System.out.print("Nhập chức năng : ");
      choice = Validation.checkInputInteger();
      switch (choice) {
        case 1:
          List<Product> products = productController.getAll();
          if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong kho");
          } else {
            System.out.println("---------------");
            System.out.println("Danh sách sản phẩm");
            for (Product temp : products) {
              System.out.println(temp);
            }
          }
          break;
        case 2:
          id = inputId();
          product = inputInformation();
          product.setId(id);
          productController.addProduct(product);
          System.out.println("Thêm mới thành công!!!");
          break;
        case 3:
          id = inputId();
           isSuccess = productController.removeProduct(id);
          if (isSuccess) {
            System.out.println("Xóa thành công!!!");
          } else {
            System.out.println("Id không tìm thấy!!!");
          }
          break;
        case 4:
          id = inputId();
          isSuccess = productController.editProduct(id);
         if (isSuccess){
           System.out.println("Sửa thành công!!!");
         } else {
           System.out.println("Id không tìm thấy!!!");
         }
          break;
        case 5:
          System.out.print("Nhập tên sản phầm cần tìm : ");
          String name = Validation.checkInputString();
           productController.findProduct(name);
          break;
        case 6:
          productController.sortProduct();
          List<Product> productList = productController.getAll();
          if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong kho");
          } else {
            System.out.println("---------------");
            System.out.println("Danh sách sản phẩm");
            for (Product temp : productList) {
              System.out.println(temp);
            }
          }
          break;
        case 0:
          System.out.println("------------------------");
          System.out.println("Trở về Menu chính!!!");
          do {
            menuManagement();

            choice = Validation.checkInputLimit(0, 4);
            switch (choice) {
              case 1:
                menuCustomer();
                break;
              case 2:
                menuProduct();
              case 3:
                break;
              case 0:
                System.exit(0);
              default:
                System.out.println("Bạn nhập không đúng lựa chọn");
            }
          } while (true);
      }
    } while (true);

  }

  public static Product inputInformation() {
    System.out.print("Nhập tên sản phẩm: ");
    String name = Validation.checkInputString();
    System.out.print("Nhập giá sản phẩm: ");
    Long price = Validation.checkInputLong();
    return new Product(name, price);
  }

  private static Integer inputId() {
    System.out.print("Nhập id sản phẩm: ");
    return Validation.checkInputInteger();
  }
}
