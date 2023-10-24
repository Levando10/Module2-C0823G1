package ss11.bai_tap.use_araylist_linkedlist;

import java.util.ArrayList;

import java.util.Scanner;

public class ProductManager {

  public ProductManager() {
  }

  ArrayList<Product> listProduct = new ArrayList<>();


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

  public void showProduct() {
    for (Product product : listProduct) {
      System.out.println(product.toString());
    }
  }

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

  public void deleteProduct() {
    Scanner scanner = new Scanner(System.in);
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

  public void sortProduct() {
    listProduct.sort( null);
  }


}
