package array_mvc.services;

import models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void createProduct(Product product);

    Boolean deleteById(Integer id);

  Boolean editProduct(int id);

  void findProduct(String name);

  void sortProduct();
}
