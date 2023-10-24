package ss11.bai_tap.use_araylist_linkedlist.view;

import ss11.bai_tap.use_araylist_linkedlist.controller.ProductController;
import ss11.bai_tap.use_araylist_linkedlist.util.Validation;

public class View {

  public static void main(String[] args) {

    ProductController productController = new ProductController();

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
      int choice = Validation.checkInputLimit(0, 6);
      switch (choice) {
        case 1 -> productController.addProduct();
        case 2 -> productController.editProduct();
        case 3 -> productController.deleteProduct();
        case 4 -> productController.showProduct();
        case 5 -> productController.findProduct();
        case 6 -> {
          productController.sortProduct();
          productController.showProduct();
        }
        case 0 -> System.exit(1);
        default -> System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
      }
    } while (true);
  }
}
