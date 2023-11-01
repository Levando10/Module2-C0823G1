package services;

import java.util.List;
import models.Product;

public interface IProductService {

  List<Product> getAllProduct();



  void addProduct(Product product);


  List<Product> searchProduct(String name);

  Boolean findId(Integer id);
}
