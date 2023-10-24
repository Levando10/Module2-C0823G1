package ss11.bai_tap.use_araylist_linkedlist;

import java.util.Scanner;

public class View {

  public static void main(String[] args) {
    ProductManager productManager = new ProductManager();
    Product product1 = new Product("1", "máy tính", 100000);
    Product product2 = new Product("2", "xe đạp", 30000);
    Product product3 = new Product("3", "màn hình", 70000);
    Product product4 = new Product("4", "điện thoại", 15000);

    productManager.listProduct.add(product1);
    productManager.listProduct.add(product2);
    productManager.listProduct.add(product3);
    productManager.listProduct.add(product4);

    do {

      System.out.println("\n-------------------------------------------------------------");
      System.out.println("Vui lòng chọn chức năng:\n" +
          "1. Thêm sản phẩm \n" +
          "2. Sửa thông tin sản phẩm \n" +
          "3. Xóa sản phẩm \n" +
          "4. Hiển thị danh sách sản phẩm \n" +
          "5. Tìm kiếm sản phẩm theo tên \n" +
          "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá \n" +
          "0. Thoát. \n");
      System.out.print("Nhập chức năng : ");
      int choice = Validation.checkInputLimit(0,6);
      switch (choice) {
        case 1 -> productManager.addProduct();
        case 2 -> productManager.editProduct();
        case 3 -> productManager.deleteProduct();
        case 4 -> productManager.showProduct();
        case 5 -> productManager.findProduct();
        case 6 -> {
          productManager.sortProduct();
          productManager.showProduct();
        }
        case 0 -> System.exit(1);
        default -> System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
      }
    } while (true);
  }
}
