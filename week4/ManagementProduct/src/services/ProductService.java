package services;

import java.util.List;
import models.Product;
import repositorys.IProductRepository;
import repositorys.ProductRepository;

public class ProductService implements IProductService {

  private IProductRepository iProductRepository = new ProductRepository();

  @Override
  public List<Product> getAllProduct() {
    return iProductRepository.getAllProduct();

  }

  @Override
  public void addProduct(Product product) {
    iProductRepository.addProduct(product);
  }

  @Override
  public Product searchProduct(String name) {
    return iProductRepository.searchProduct(name);
  }


}
