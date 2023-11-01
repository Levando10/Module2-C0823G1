package view;

import controllers.ProductController;
import java.util.List;
import models.Product;
import utils.Validation;

public class ViewProduct {


  public static void main(String[] args) {

    ProductController productController = new ProductController();
    List<Product> productList;
    Product product;
    Integer id;
    do {
      System.out.println("\n-------------------------------------------------------------");
      System.out.println(
          "Vui lòng chọn chức năng:\n1. Thêm sản phẩm \n2. Hiển thị thông tin sản phẩm \n3. Tìm kiếm sản phẩm theo tên \n0. Thoát. \n");
      System.out.print("Nhập chức năng : ");
      int choice = Validation.checkInputLimit(0, 6);
      switch (choice) {
        case 1:
          addProduct(productController);
          break;
        case 2:
          displayListProduct(productController);
          break;
        case 3:
          searchById(productController);

          break;
        case 0:
          System.exit(1);
          break;
      }
    } while (true);
  }

  private static void searchById(ProductController productController) {
    Product product;
    List<Product> productList;
    productList = productController.getAllProduct();
    List<Product> searchList;
    if (productList.isEmpty()) {
      System.out.println("Danh Sách rỗng!!!");
    } else {
      System.out.print("Nhập sản phẩm cần tìm : ");
      String name = Validation.checkInputString();
      searchList = productController.searchProduct(name);
      if (searchList == null) {
        System.out.println("Không tìm thấy!!!");
      } else {
        for (Product temp : searchList){
          System.out.println(temp);
        }
      }

    }
  }

  private static void displayListProduct(ProductController productController) {
    List<Product> productList;
    productList = productController.getAllProduct();
    if (productList.isEmpty()) {
      System.out.println("Danh Sách rỗng!!!");
    } else {
      if (productList != null){
        for (Product temp : productList) {
          System.out.println(temp);
        }
      } else {
        System.out.println("Không tìm thấy");
      }

    }
  }

  private static void addProduct(ProductController productController) {
    Product product;
    Integer id;
    id = inputId();
    Boolean checkId = productController.findId(id);
    while (checkId == true) {
      System.out.println("Vui lòng không nhập id trùng !!!");
      id = inputId();
      checkId = productController.findId(id);
    }

    product = inputInformation();
    product.setId(id);
    productController.addProduct(product);
    System.out.println("thêm thành công!!!");
  }


  private static Integer inputId() {
    System.out.print("Nhập id : ");

    return Validation.checkInputInteger();
  }

  private static Product inputInformation() {
    //    products.add(new Product(4, "Xe lửa", 15820394.0, "Đạp Điện", "Tên lửa"));
    System.out.print("Nhập tên : ");
    String name = Validation.checkInputString();
    System.out.print("Nhập Giá :  ");
    Double price = Validation.checkInputDouble();
    System.out.print("Nhập Nhà sản xuất : ");
    String manufactured = Validation.checkInputString();
    System.out.print("Nhập mô tả : ");
    String describe = Validation.checkInputString();
    return new Product(name, price, manufactured, describe);
  }
}
