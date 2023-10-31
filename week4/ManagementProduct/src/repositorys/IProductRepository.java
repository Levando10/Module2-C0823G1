package repositorys;

import java.util.List;
import models.Product;

public interface IProductRepository {

  List<Product> getAllProduct();

  void addProduct(Product product);

  Product searchProduct(String name);
}
