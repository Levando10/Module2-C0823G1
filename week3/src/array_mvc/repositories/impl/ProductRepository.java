package array_mvc.repositories.impl;

import demo_mvc.src.utils.validate.Validation;
import java.util.Scanner;
import models.Product;
import repositories.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

  private static List<Product> products = new ArrayList<>();

  static {
    products.add(new Product(1, "Cơm chiên", 25000l));
    products.add(new Product(2, "Chocolate", 15000l));
    products.add(new Product(3, "Xe đạp", 65000l));

  }

  @Override
  public List<Product> getAll() {
    return products;
  }

  @Override
  public void save(Product product) {
    products.add(product);
  }

  @Override
  public Product findById(Integer id) {
    for (Product product : products) {
      if (product.getId().equals(id)) {
        return product;
      }
    }
    return null;
  }

  @Override
  public void deleteById(Integer id) {

    for (Product product : products) {
      if (product.getId().equals(id)) {
        products.remove(product);
        break;
      }
    }
  }

  @Override
  public void editById(Integer id) {
    for (Product product : products) {
      if (product.getId().equals(id)) {
        System.out.print("Nhập tên cần sửa : ");
        String name = Validation.checkInputString();
        System.out.print("\nNhập giá cần sửa : ");
        Long price = Validation.checkInputLong();
        product.setName(name);
        product.setPrice(price);
        break;
      }
    }
  }

  @Override
  public void findProduct(String name) {
    boolean check = false;
    for (Product product : products){
     if (product.getName().toLowerCase().contains(name.toLowerCase())){
       System.out.println(product);
       check = true;
     }
    }
    if (!check){
      System.out.println("Không tìm thấy sản phẩm!!!");
    }
  }

  @Override
  public void sortProduct() {
products.sort(null);
  }


}
