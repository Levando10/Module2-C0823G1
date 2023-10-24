package ss11.bai_tap.use_araylist_linkedlist.reposility;

import java.util.ArrayList;

import ss11.bai_tap.use_araylist_linkedlist.module.Product;
import ss11.bai_tap.use_araylist_linkedlist.util.Validation;

public class ProductManager implements IProductManager{

  public ProductManager() {
  }

 private static ArrayList<Product> listProduct = new ArrayList<>();

  static {
    Product product1 = new Product("1", "máy tính", 136000);
    Product product2 = new Product("2", "xe đạp", 37000);
    Product product3 = new Product("3", "màn hình", 75300);
    Product product4 = new Product("4", "điện thoại", 19450);

    listProduct.add(product1);
    listProduct.add(product2);
    listProduct.add(product3);
    listProduct.add(product4);
  }

  @Override
  public void addProduct() {
    System.out.print("Nhập id sản phẩm : ");
    String id = Validation.checkInputString();
    System.out.print("Nhập tên sản phẩm : ");
    String name =Validation.checkInputString();
    System.out.print("Nhập giá sản phẩm : ");
    double price = Validation.checkInputDouble();

    Product product = new Product(id, name, price);
    listProduct.add(product);
  }
  @Override

  public void showProduct() {
    for (Product product : listProduct) {
      System.out.println(product.toString());
    }
  }
  @Override

  public void editProduct() {

    System.out.print("Nhập id sản phẩm muốn sửa : ");
    String id = Validation.checkInputString();

    for (Product product : listProduct) {
      if (product.getId().equals(id)) {
        System.out.print(
            "Bạn có muốn sửa sản phẩm này không (Y or y để sửa  hoặc N or n để hủy sửa) : ");
        char check = Validation.checkYesNo();
        if (check == 'y' || check == 'Y') {
          System.out.print("Nhập tên cần sửa : ");
          String name = Validation.checkInputString();
          System.out.print("Nhập Giá cần sửa : ");
          double price = Validation.checkInputDouble();
          product.setName(name);
          product.setPrice(price);
          System.out.println("Sửa thành công!!!");
          return;
        } else {
          System.out.print("Hủy sửa!!!");
          return;
        }
      }// find product
    }
    System.out.print("Không tìm thấy sản phẩm cần sửa !!!");

  }
  @Override

  public void deleteProduct() {
    System.out.print("Nhập id sản phẩm muốn xóa : ");
    String id = Validation.checkInputString();
    for (Product product : listProduct) {
      if (product.getId().equals(id)) {
        System.out.print(
            "Bạn có muốn xóa sản phẩm này không (Y or y để xóa  hoặc N or n để hủy xóa) : ");
        char checked = Validation.checkYesNo();
        if (checked == 'y' || checked == 'Y') {
          listProduct.remove(product);
          System.out.println("Xóa thành công!!!");
          return;
        } else {
          System.out.print("Hủy xóa!!!");
          return;
        }
      }
    }
    System.out.print("Không tìm thấy sản phẩm cần xóa !!!");
  }
  @Override

  public void findProduct() {
    System.out.print("Nhập tên sản phẩm cần tìm : ");
    String name = Validation.checkInputString();
    for (Product product :
        listProduct) {
      if (product.getName().contains(name)) {
        System.out.println(product);
        return;
      }
    }
    System.out.println("Tên sản phẩm không có trong hệ thống!!!");
  }
  @Override

  public void sortProduct() {
    listProduct.sort( null);
  }


}
