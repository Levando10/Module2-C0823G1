package repositorys;

import java.util.List;
import models.Product;

public interface IProductRepository {

  List<Product> getAllProduct();

  void addProduct(Product product);

  List<Product> searchProduct(String name);

  Boolean findId(Integer id);
}
